package design.patterns.java.strategy;

import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


public class StrategyDemo {

    private static Logger logger = LoggerFactory.getLogger(StrategyDemo.class.getName());

    public static void main(String[] args) {
        PromotionStrategy halfOffPromo = new HalfOffPromotionStrategy();
        PromotionStrategy clearancePromo = new ClearancePromotionStrategy();

        Customer customer1 = new Customer(halfOffPromo);
        customer1.addItem(100.0);
        customer1.addItem(50.0);
        customer1.addItem(20.0);

        logger.info("Customer 1");
        logger.info("Total: " + customer1.getTotalBeforePromo());
        logger.info("Total (After Promo): " + customer1.getTotalAfterPromo());

        Customer customer2 = new Customer(clearancePromo);
        customer2.addItem(100.0);
        customer2.addItem(50.0);
        customer2.addItem(20.0);

        logger.info("Customer 2");
        logger.info("Total: " + customer2.getTotalBeforePromo());
        logger.info("Total (After Promo):" + customer2.getTotalAfterPromo());
    }
}

class Customer {
    private List<Double> items;
    private PromotionStrategy promotionStrategy;

    public Customer(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
        this.items = Lists.newArrayList();
    }

    public void addItem(Double item){
        items.add(item);
    }

    public  double getTotalBeforePromo(){
        double total = items.stream().mapToDouble(i -> i).sum();
        return total;
    }

    public double getTotalAfterPromo(){
        double total = getTotalBeforePromo();
        double promotion = promotionStrategy.getPromotion(total);
        return total - promotion;
    }
}

interface PromotionStrategy{
    double getPromotion(Double totalAmount);
}

class HalfOffPromotionStrategy implements PromotionStrategy {
    @Override
    public double getPromotion(Double totalAmount) {
        return totalAmount * 0.5;
    }
}

class ClearancePromotionStrategy implements PromotionStrategy{
    @Override
    public double getPromotion(Double totalAmount) {
        return totalAmount * 0.75;
    }
}
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import com.sbi.entity.*;
import com.sbi.entity.OnlineShoppingService;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations= {"classpath:spring_orm.xml"})
public class OnlineOrderTest {
	
	@Autowired
	private OnlineShoppingService shopIt;
	
	@Test
	public void testTransaction() {
		Order order = new Order();
		order.setProductId(123);
		order.setPrice(550.00);
		order.setQuantity(5);
		shopIt.placeOrder(order);
	}
}

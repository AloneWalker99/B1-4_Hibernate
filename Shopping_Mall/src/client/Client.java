package client;

import entities.Customer;
import entities.Employee;
import entities.Item;
import entities.Mall;
import entities.MallAdmin;
import entities.Order;
import entities.Shop;
import entities.ShopOwner;
import entities.User;
import service.IShopService;
import service.IShopServiceImpl;

public class Client {

	//@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		MallAdmin mallAdmin = new MallAdmin();
		@SuppressWarnings("unused")
		IShopService service = new IShopServiceImpl();
		
		//MallAdmin class
				//create operation
				mallAdmin.setId(1000);
				mallAdmin.setName("Soujan");
				mallAdmin.setPassword("Prk");
				mallAdmin.setPhone("8746953891");
				
				
				//Mall Class
				Mall mall = new Mall();
				mall.setId(153);
				mall.setMallName("SP Mall");
				mall.setLocation("Bangalore");
				mall.setCategories("Popularity");
				
				//Shop Class
				//create 
				Shop shop = new Shop();
				shop.setShopId(16);
				shop.setShopCategory("PVR");
				shop.setShopEmployeeID(1);
				shop.setShopName("Samosa Party");
				shop.setCustomers("James");
				shop.setShopStatus("Open");
				shop.setShopOwner("Rocky");
				shop.setLeaseStatus("3 years");
				
				//Retrieve
			/*	shop = service1.searchShopById(153);
				System.out.println("Id is: "+shop.getShopEmployeeID());
				System.out.println("name is: "+shop.getShopName());
				System.out.println("shopOwner is: "+shop.getShopOwner());
				System.out.println("shopLease is: "+shop.getLeaseStatus());
				
				//update
				shop=service1.searchShopById(12);
				shop.setShopName("Zeba");
				service1.updateShop(shop);
				System.out.println("update is successful");
			
				//delete
				shop= service1.searchShopById(12);
				service1.deleteShop(12);
				System.out.println("delete is successful"); */
				
				//ShopOwner Class
				ShopOwner owner = new ShopOwner();
				owner.setId(05);
				owner.setName("Soujan");
				owner.setDob("18-06-1988");
				owner.setAddress("Mangalore");
				owner.setShop_id(02);
				
				//Item Class
				Item item = new Item();
				item.setId(04);
				item.setName("Dosa");
				item.setPrice(350);
				item.setManufacturingDate("16-05-2022");
				item.setExpiryDate("02-06-2022");
				item.setCategory("Veg");
				
				//Employee Class
				Employee employee = new Employee();
				employee.setId(002);
				employee.setName("Suresh");
				employee.setDob("19-05-2000");
				employee.setSalary(40000.0f);
				employee.setAddress("Bengaluru");
				employee.setDesignation("Sales");
				employee.setShop_id(03);
				
				//Order Class
				Order order = new Order();
				order.setId(20);
				order.setCustomer_id(04);
				order.setShop_id(10);
				order.setTotal(550.0f);
				order.setPaymentMode("Online");
				order.setDateOfPurchase("15-05-2022");
				
				//Customer Class
				Customer customer = new Customer();
				customer.setId(12);
				customer.setName("Dileep");
				customer.setOrder_id(03);
				customer.setPhone("987654321");
				customer.setEmail("dlp@gmail.com");
				
				//User Class
				User user = new User();
				user.setId(05);
				user.setName("Shashank");
				user.setPassword("abtzzt@32");
				user.setType("Regular");	
				
			}

		}
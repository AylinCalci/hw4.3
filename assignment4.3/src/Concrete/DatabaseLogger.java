package Concrete;

import Abstract.LoggerService;
import Entities.User;

public class DatabaseLogger implements LoggerService {

	@Override
	public void addUser(User user) {
		
		
	}

	@Override
	public void deleteUser(User user) {
		
		
	}

	@Override
	public void updateEmail(User user,String newEmail) {
		
		user.setEmail(newEmail);
		
	}

	@Override
	public void addMoney(User user, int amount) {
		
		user.setWallet(user.getWallet()+amount);
		
	}

	@Override
	public int showMoney(User user) {
		
		return user.getWallet();
	}

	@Override
	public void decraseMoney(User user, int amount) {
		
		user.setWallet(user.getWallet()-amount);
		
	}

}
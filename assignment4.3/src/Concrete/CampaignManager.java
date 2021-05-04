package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;
import Entities.Game;

public class CampaignManager implements CampaignService {

	@Override
	public void startCampaign(Campaign campaign, Game game) {
		if (game.getPrice() >= campaign.getDiscount()) {
			game.setPrice(game.getPrice() - campaign.getDiscount());
			System.out.println(
					campaign.getName() + " Kampanyas� ile " + game.getName() + " " + game.getPrice() + "liraya d��t�.");

		} else {
			System.out.println(game.getName() + " " + campaign.getName() + " Kampanyas�ndan yararlan�lamad�.");
		}

	}

	@Override
	public void stopCampaign(Campaign campaign, Game game) {
		game.setPrice(game.getPrice()+campaign.getDiscount());
		System.out.println(campaign.getName()+" Kampanyas� bitti "+game.getName()+" "+game.getPrice()+"liraya y�kseldi." );

	}

	@Override
	public void updateCampaign(Campaign campaign, int discount, Game game) {
		game.setPrice(game.getPrice()+campaign.getDiscount());
		if(game.getPrice()>=discount) {
			game.setPrice(game.getPrice()-discount);
			System.out.println(campaign.getName() + " Kampanyas� ile " + game.getName() + " " + game.getPrice() + "liraya d��t�");
		
		}
		else {
			System.out.println(game.getName() + " " + campaign.getName() + " Kampanyas�ndan yararlan�lamad�.");
		}
		campaign.setDiscount(discount);

	}

}
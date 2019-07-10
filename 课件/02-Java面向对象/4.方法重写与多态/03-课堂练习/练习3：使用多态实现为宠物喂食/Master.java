package cn.jbit.epet.override;

public class Master {
	// 给宠物看病
    public void cure(Pet pet) {
        if (pet.getHealth() < 50)
            pet.toHospital();        
    }
    /**
	 * 主人给宠物喂食。
	 */
	public void feed(Pet pet) {
		pet.eat();
	}

}

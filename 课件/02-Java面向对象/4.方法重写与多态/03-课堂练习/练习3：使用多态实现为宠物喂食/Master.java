package cn.jbit.epet.override;

public class Master {
	// �����￴��
    public void cure(Pet pet) {
        if (pet.getHealth() < 50)
            pet.toHospital();        
    }
    /**
	 * ���˸�����ιʳ��
	 */
	public void feed(Pet pet) {
		pet.eat();
	}

}

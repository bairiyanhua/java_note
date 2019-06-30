package cn.jbit.epet.override;

public class Master {
	// ¸ø³èÎï¿´²¡
    public void cure(Pet pet) {
        if (pet.getHealth() < 50)
            pet.toHospital();        
    }


}

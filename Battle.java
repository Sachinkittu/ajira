import java.util.*;

public class Battle {
    List<Day> days;

    public boolean initialize(String input) {
        try {
            String[] inputAsArray = input.split(Delimeter.days_Delim);
            if (inputAsArray.length > 0) {
                // Create Objects
                Attack attack = null;
                Day day = null;
                days = new ArrayList<Day>();
                for (String s : inputAsArray) {
                    String[] eachAttack = s.split(Delimeter.attacks_Delim);
                    if (eachAttack.length > 0) {
                        List<Attack> attacks = new ArrayList<Attack>();
                        for (String trival : eachAttack) {
                            String dir = null;
                            String[] d = trival.trim().split(Delimeter.attack_Delim);
                            if (d.length > 0) {
                                dir = d[1].trim();
                                attack = new Attack(dir, Integer.parseInt(d[3].trim()));
                                attacks.add(attack);
                            } else {
                                System.out.println("Invalid Input Data");
                                return false;
                            }
                        }
                        day = new Day(s.substring(0, s.indexOf(Delimeter.day_Detail_Delim)), attacks);
                        days.add(day);
                    } else {
                        System.out.println("Invalid Input Data");
                        return false;
                    }
                }
                return true;
            }
        } catch (ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e) {
            System.out.println("Invalid input data");
            return false;
        }
        System.out.println("Invalid Data");
        return false;
    }

    // start the battle
    public int StartTheBattle() {
        GetAndSetDirection setDirec = new GetAndSetDirection();
        int success = 0;
        List<Attack> attacks;
        if (days.size() > 0) {
            for (Day d : days) {
                attacks = d.getAttacks();
                for (Attack a : attacks) {
                    switch (a.getDirection()) {
                        case "N": {
                            setDirec.getNorth().attackTheWall(a.getStrength());
                            break;
                        }
                        case "S": {
                            setDirec.getSouth().attackTheWall(a.getStrength());
                            break;
                        }
                        case "E": {
                            setDirec.getEast().attackTheWall(a.getStrength());
                            break;
                        }
                        case "W": {
                            setDirec.getWest().attackTheWall(a.getStrength());
                            break;
                        }

                    }
                }
                setDirec.getNorth().repairTheWall();
                setDirec.getSouth().repairTheWall();
                setDirec.getEast().repairTheWall();
                setDirec.getWest().repairTheWall();
            }
        }
        success = setDirec.getNorth().getSuccess() + setDirec.getSouth().getSuccess() + setDirec.getEast().getSuccess()
                + setDirec.getWest().getSuccess();
        return success;
    }
}

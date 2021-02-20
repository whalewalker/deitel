package Java.com.javaChapter7.beamMachine;

import java.security.SecureRandom;

public class BeamMachine {
    private int[] slot;
    private int balls;
    private PathPosition path;

    public BeamMachine(int[] slot, int balls) {
        this.slot = slot;
        this.balls = balls;
    }

    public int[] getSlot() {
        return slot;
    }

    public void setSlot(int[] slot) {
        this.slot = slot;
    }

    public int getBalls() {
        return balls;
    }

    public void setBalls(int balls) {
        this.balls = balls;
    }

    public PathPosition getPath() {
        return path;
    }

    public void setPath(PathPosition path){
        this.path = path;
    }

    public void changePath() {
        int fall = falls();
        if(fall == 1)
            setPath(PathPosition.RIGHT);
        else
            setPath(PathPosition.LEFT);
    }

    public int falls(){
        SecureRandom random = new SecureRandom();
        return random.nextInt(2);
    }

    public String beamPaths() {
        StringBuilder path = new StringBuilder();
        for (int count = 0; count < slot.length; count++){
            changePath();
            if (getPath() == PathPosition.RIGHT)
                path.append("R");
            else
                path.append("L");
        }
        return path.toString().toString();
    }

    public void calculateSlot() {
        int position = 0;
    try{
        for (int count = 0; count < balls; count++) {
            String pathRepresentation = beamPaths();
            position = getPosition(pathRepresentation);
            slot[position]++;
        }
    }catch (ArrayIndexOutOfBoundsException exe){
        System.out.println(exe.getMessage());
    }

    }

    private int getPosition(String pathRepresentation) {
        int position = 0;
        for (int counter = 0; counter < pathRepresentation.length(); counter++){
            if (pathRepresentation.charAt(counter) == 'R')
                position += 1;
        }
        return position - 1;
    }


    public String displayPath(){
        StringBuilder paths = new StringBuilder();
        for (int count = 0; count < balls; count++) {
            paths.append(beamPaths()).append("\n");
        }
        return paths.toString();
    }

    public String displayBeamMachine(){
        StringBuilder beam = new StringBuilder();
        for(int column = 0; column < slot.length; column++){
           if(slot[column] == 0){
               beam.append("# ");
           }else {
               beam.append("O ");
           }
        }
        return beam.toString();
    }
}

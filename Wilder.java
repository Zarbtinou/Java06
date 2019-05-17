public class Wilder {
    private String firstname;
    private boolean aware;


    public Wilder(String firstname, boolean aware){
        this.firstname = firstname;
        this.aware = aware;
    }

    public String getFirstname() {
        return firstname;
    }

    public boolean isAware() {
        return aware;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

    public String whoAmI(){

        String str =  "Je m'appelle ";
        str += this.getFirstname();
        str += (this.isAware())? " et je suis aware" : " et je ne suis pas aware";
        return str ;
    }
}
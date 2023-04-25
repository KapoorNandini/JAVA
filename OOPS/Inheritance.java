// CLASS A EXTENDS B 
// Format fr single level inheritance
// class mukesh extends dhirubhai is ex of single level inheritance

// class akash extends mukesh and mukesh extends dhirubhai is an ex of multilevel inheritance

// Must write the workhard and getNetWorth method for both classes as it will inherit from the prev class
// So if for mukesh class getnetworth is called it will inherit this method from dhirubhai and the ans will be 
// same as it is in dhirubhai class i-e 2
// So must define these methods again for diff classes 

class Dhirubhai{
    int vimal;
    int reliance;

    public Dhirubhai(){
        System.out.println("Dhirubhai Ambani is Born ");
        this.vimal = 0;
        reliance = 0;
    }

    void workHard(){
        this.reliance++;
        this.vimal++;
    }

    int getNethWorth(){
        return vimal + reliance;
    }
}

class Mukesh extends Dhirubhai{
    int reliancePetroleum;
    int relianceRetail;

    public Mukesh(){
        System.out.println("Mukesh Ambani is Born");
        this.reliancePetroleum=0;
        relianceRetail=0;
    }

    void workHard(){
        reliancePetroleum++;
        relianceRetail++;
        vimal++;
        reliance++;
    }

    int getNethWorth(){
        return reliance+vimal+reliancePetroleum+relianceRetail;
    }
}

class Akash extends Mukesh{
    int jio;
    int relianceTrends;

    public Akash(){
        System.out.println("Akash Ambani is Born");
        this.jio=0;
        this.reliance=0;
        this.reliancePetroleum=0;
        this.relianceRetail=0;
        this.relianceTrends=0;
        this.vimal=0;
    }

    void workHard(){
        jio++;
        reliance++;
        reliancePetroleum++;
        relianceRetail++;
        relianceTrends++;
        vimal++;
    }

    int getNethWorth(){
        return jio+reliance+reliancePetroleum+relianceRetail+relianceTrends+vimal;
    }
}



public class Inheritance {
    public static void main(String[] args) {
        Dhirubhai dhirubhai = new Dhirubhai();

        System.out.println(dhirubhai.getNethWorth());
        dhirubhai.workHard();
        System.out.println(dhirubhai.getNethWorth());

        Mukesh mukesh = new Mukesh();
        System.out.println(mukesh.getNethWorth());
        mukesh.workHard();
        System.out.println(mukesh.getNethWorth());

        Akash akash = new Akash();
        System.out.println(akash.getNethWorth());
        akash.workHard();
        System.out.println(akash.getNethWorth());

    }
}

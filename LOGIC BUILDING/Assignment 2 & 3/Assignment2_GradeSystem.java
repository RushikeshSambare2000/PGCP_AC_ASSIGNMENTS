class Grade {
    int Math;
    int Science;
    int History;

    Grade(int math, int science, int history) {
        Math = math;
        Science = science;
        History = history;
    }

    void result() {
        int avg = (Math + Science + History) / 3;
        if (avg < 30) {
            System.out.println("Fail.. Avg Marks : " + avg);
        }
        if (avg >= 90) {
            System.out.println("Avg Marks :" + avg + "\n Grade : A ");
        }
        if (avg >= 70 && avg <= 89) {
            System.out.println("Avg Marks :" + avg + "\n Grade : B ");
        }
        if ((avg >= 50 && avg <= 69)) {
            System.out.println("Avg Marks :" + avg + "\n Grade : C ");
        }
        if (avg >= 30 && avg <= 49) {
            System.out.println("Avg Marks :" + avg + "\n Grade : D ");
        }
    }
}

class Assignment2_GradeSystem {
    public static void main(String[] args) {
        Grade G1 = new Grade(80, 85, 90);
        G1.result();
    }
}

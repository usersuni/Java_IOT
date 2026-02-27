package threads;

public class FestRegistration {
    static class FormFilling extends Thread {
        public void run(){
            System.out.println("Form Filling Started");
        }
    }
    static class DocumentsUpload extends Thread {
        public void run(){
            System.out.println("Upload Documents");
        }
    }
    static class EmailNoti extends Thread {
        public void run(){
            System.out.println("Confirm Email");
        }
    }

    public static void main(String[] args) {
        FormFilling t1 = new FormFilling();
        DocumentsUpload t2 = new DocumentsUpload();
        EmailNoti t3 = new EmailNoti();
        t1.start();
        t2.start();
        t3.start();
    }
}

package model;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends Users{
    //Atributos
    private String speciality;
    private ArrayList<AvailableAppointment> avaiableAppointments = new ArrayList<>();

    public Doctor(String name, String email){
        super(name, email);
    }

    public void setSpeciality(String speciality){
        this.speciality = speciality;
    }

    public String getSpeciality(){
        return this.speciality;
    }
    //Comportamientos


    public void addAvaiableAppointment(String date, String time){

        avaiableAppointments.add(new Doctor.AvailableAppointment(date, time));

    }

    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return avaiableAppointments;
    }
    
    @Override
    public String toString(){
        return super.toString()+"\nSpeciality: "+speciality+"\nAvailable: "+avaiableAppointments.toString();
    }
    
    @Override
    public void showDataUser() {
        System.out.println("Hospital: Cruz Roja");
        System.out.println("Departamento: Cancerología");
        
    }

    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        
        public AvailableAppointment(String date, String time){
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            this.time = time; 
        }
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate(String DATE) {
            return date;
        }

        public String getDate(){
            return format.format(date);
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString(){
            return "Available Appointments \nDates; "+date+"\nTime: "+time;
        }
    }

}

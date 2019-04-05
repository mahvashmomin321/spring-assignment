package com.capgemini.spring.model;


public class NetworkManager{
 
    private HttpURLConnection connection;
    private String urlStr;
     
    public void setUrlStr(String urlStr){
        this.urlStr = urlStr;
    }
     
    @PostConstruct
    public void init(){
         
        System.out.println("Inside init() method...");
        URL obj;
            obj = new URL(this.urlStr);
            //initialize http connection here
            this.connection = (HttpURLConnection) obj.openConnection();
        
    }
     
    @PreDestroy
    public void destroy(){
        try{
            System.out.println("Inside destroy() method...");
            if(this.connection != null) {
                connection.disconnect();
            }
        } catch(Exception ex){
             
        }
    }
     
    public void readData(){
        try {
            int responseCode = this.connection.getResponseCode();
            System.out.println("Response code: "+responseCode);
            /**
             * do your business logic here
             */
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
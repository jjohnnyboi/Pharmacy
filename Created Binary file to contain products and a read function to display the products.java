public void display() throws FileNotFoundException, IOException, ClassNotFoundException{
        try{
            FileInputStream meds = new FileInputStream("Meds.txt");
            Scanner sc = new Scanner(meds);
            while(sc.hasNext()){
                System.out.println(sc.nextLine());
            }
            sc.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

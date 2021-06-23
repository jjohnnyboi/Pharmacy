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
    public void WriteInMeds()throws FileNotFoundException, IOException{
        try{
            FileWriter medWriter = new FileWriter("Meds.txt");
            medWriter.write(this.prodName + "\n");
            medWriter.write(this.prodType + "\n");
            medWriter.write(this.scName + "\n");
            medWriter.write(this.quantity + "\n");
            medWriter.write(this.prodID + "\n");
            medWriter.write(this.prodDate + "\n");
            medWriter.write(this.expDate + "\n");
            medWriter.close();
        }
        catch (IOException e){
            System.out.println("An Error Occured");
            e.printStackTrace();
        }
    }

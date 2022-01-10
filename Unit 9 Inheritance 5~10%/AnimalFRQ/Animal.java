class Animal
{
    private String type_name;
    private String species_name;
    private String iidname;
    public Animal(String itn, String isn, String iN)
    {
        type_name = itn;
        species_name = isn;
        iidname = iN;
    }
    public String toString(){
        return iidname + " the " + species_name + " is a " + type_name;
    }
}

//import java.util.HashMap;
//import java.util.Map;
public class exe {
    private String[] NPCs;
    private String[][] NPC_replacement_names;
    //private Map<String, Integer> NPCsHM;
    
    private int[] NPC_relevances;
    private int[] NPC_ranking;
    
    private String[] Biomes;
    private String[][] Biome_replacement_names;
    //private Map<String, Integer> BiomeHM;
    
    private double[][] hMsNPCs; //hMs = happinessMultipliers
    private double[][] hMsBiomes;
    
    public exe() {
        NPCs = new String[25]; NPC_replacement_names = new String[NPCs.length][NPCs.length]; //WIP
        NPC_relevances = new int[NPCs.length]; NPC_ranking = new int[NPCs.length];
        Biomes = new String[8]; Biome_replacement_names = new String[Biomes.length][5]; //WIP
        hMsNPCs = new double[NPCs.length][NPCs.length];
        hMsBiomes = new double[NPCs.length][Biomes.length];
        
        Array_setup();
        Matrix_setup();
        Preferences_setup();
        
        //add relevances
        Ranking_setup();
    }
    
    public int getNPC(String name) {
        for(int i=0; i<NPCs.length; i++) {
            if(NPCs[i].equalsIgnoreCase(name)) return i;
        }
        for(int i=0; i<NPC_replacement_names.length; i++) {
            for(int j=0; j<NPC_replacement_names[i].length; j++) {
                if(NPC_replacement_names[i][j] != "") break;
                else if(NPC_replacement_names[i][j].equalsIgnoreCase(name)) return i;
            }
        }
        return -1;
    }
    
    public int getBiome(String name) {
        for(int i=0; i<Biomes.length; i++) {
            if(Biomes[i].equalsIgnoreCase(name)) return i;
        }
        for(int i=0; i<Biome_replacement_names.length; i++) {
            for(int j=0; j<Biome_replacement_names[i].length; j++) {
                if(Biome_replacement_names[i][j] != "" && Biome_replacement_names[i][j].equalsIgnoreCase(name))
                return i;
            }
        }
        return -1;
    }
    
    public double getHappiness(String[][] currentArrangement) {
        return 1;
    }
    
    public double GoThroughAllPossibilitiesRecursively(int currentIndex, String[][] currentArrangement) {
        
        return getHappiness(currentArrangement);
    }
    
    
    
    
    
    
    
    
    
    
    /**Just Setup*/
    //I said just setup
    private void Ranking_setup() {
        NPC_ranking[0] = getNPC("Angler");
        NPC_ranking[1] = getNPC("Mechanic");
        NPC_ranking[2] = getNPC("Goblin Tinkerer");
        NPC_ranking[3] = getNPC("Steampunker");
        NPC_ranking[4] = getNPC("Nurse");
        NPC_ranking[5] = getNPC("Wizard");
        NPC_ranking[6] = getNPC("Arms Dealer");
        
        NPC_ranking[7] = getNPC("Demolitionist");
        NPC_ranking[8] = getNPC("Dryad");
        NPC_ranking[9] = getNPC("Pirate");
        NPC_ranking[10] = getNPC("Witch Doctor");
        NPC_ranking[11] = getNPC("Tavernkeep");
        NPC_ranking[12] = getNPC("Tax Collector");
        
        NPC_ranking[13] = getNPC("Cyborg");
        NPC_ranking[14] = getNPC("Truffle");
        NPC_ranking[15] = getNPC("Zoologist");
        
        NPC_ranking[16] = getNPC("Merchant");
        NPC_ranking[17] = getNPC("Golfer");
        NPC_ranking[18] = getNPC("Party Girl");
        NPC_ranking[19] = getNPC("Dye Trader");
        NPC_ranking[20] = getNPC("Stylist");
        NPC_ranking[21] = getNPC("Painter");
        NPC_ranking[22] = getNPC("Clothier");
        NPC_ranking[23] = getNPC("Princess");
        NPC_ranking[24] = getNPC("Guide");
    }
    
    private void Array_setup() {
        Biomes[0] = "Forest";
        Biomes[1] = "Snow";
        Biomes[2] = "Desert";
        Biomes[3] = "Jungle";
        Biomes[4] = "Ocean";
        Biomes[5] = "Glowing Mushroom";
        Biomes[6] = "Underground"; //Also includes Caverns/Underworld
        Biomes[7] = "Hallow";
        
        NPCs[0] = "Guide";
        NPCs[1] = "Merchant";
        NPCs[2] = "Nurse";
        NPCs[3] = "Demolitionist";
        NPCs[4] = "Dye Trader";
        NPCs[5] = "Angler";
        NPCs[6] = "Zoologist";
        NPCs[7] = "Dryad";
        NPCs[8] = "Painter";
        NPCs[9] = "Golfer";
        NPCs[10] = "Arms Dealer";
        NPCs[11] = "Tavernkeep";
        NPCs[12] = "Stylist";
        NPCs[13] = "Goblin Tinkerer";
        NPCs[14] = "Witch Doctor";
        NPCs[15] = "Clothier";
        NPCs[16] = "Mechanic";
        NPCs[17] = "Party Girl";
        NPCs[18] = "Wizard";
        NPCs[19] = "Tax Collector";
        NPCs[20] = "Truffle";
        NPCs[21] = "Pirate";
        NPCs[22] = "Steampunker";
        NPCs[23] = "Cyborg";
        NPCs[24] = "Princess";
    }
    
    private void Matrix_setup() {
        for(int i=0; i<hMsNPCs.length; i++) {
            for(int j=0; j<hMsNPCs[i].length; j++) {
                hMsNPCs[i][j] = 1;
            }
        }
        for(int i=0; i<hMsBiomes.length; i++) {
            for(int j=0; j<hMsBiomes[i].length; j++) {
                hMsBiomes[i][j] = 1;
            }
        }
    }
    
    private void Preferences_setup() {
        int Guide = getNPC("Guide");
        int Merchant = getNPC("Merchant");
        int Zoologist = getNPC("Zoologist");
        int Golfer = getNPC("Golfer");
        int Nurse = getNPC("Nurse");
        int Tavernkeep = getNPC("Tavernkeep");
        int Party_Girl = getNPC("Party Girl");
        int Wizard = getNPC("Wizard");
        int Demolitionist = getNPC("Demolitionist");
        int Goblin_Tinkerer = getNPC("Goblin Tinkerer");
        int Clothier = getNPC("Clothier");
        int Dye_Trader = getNPC("Dye Trader");
        int Arms_Dealer = getNPC("Arms Dealer");
        int Steampunker = getNPC("Steampunker");
        int Dryad = getNPC("Dryad");
        int Painter = getNPC("Painter");
        int Witch_Doctor = getNPC("Witch Doctor");
        int Stylist = getNPC("Stylist");
        int Angler = getNPC("Angler");
        int Pirate = getNPC("Pirate");
        int Mechanic = getNPC("Mechanic");
        int Tax_Collector = getNPC("Tax Collector");
        int Cyborg = getNPC("Cyborg");
        int Truffle = getNPC("Truffle");
        int Princess = getNPC("Princess");
        
        int Forest = getBiome("Forest");
        int Snow = getBiome("Snow");
        int Desert = getBiome("Desert");
        int Jungle = getBiome("Jungle");
        int Ocean = getBiome("Ocean");
        int Glowing_Mushroom = getBiome("Glowing Mushroom");
        int Underground = getBiome("Underground");
        int Hallow = getBiome("Hallow");
        
        double loved = 0.88;
        double liked = 0.94;
        double disliked = 1.06;
        double hated = 1.12;
        
        hMsBiomes[Guide][Forest] = liked; hMsBiomes[Guide][Ocean] = disliked;
        hMsBiomes[Merchant][Forest] = liked; hMsBiomes[Merchant][Desert] = disliked;
        hMsBiomes[Zoologist][Forest] = liked; hMsBiomes[Zoologist][Desert] = disliked;
        hMsBiomes[Golfer][Forest] = liked; hMsBiomes[Golfer][Underground] = disliked;
        hMsBiomes[Nurse][Hallow] = liked; hMsBiomes[Nurse][Snow] = disliked;
        hMsBiomes[Tavernkeep][Hallow] = liked; hMsBiomes[Tavernkeep][Snow] = disliked;
        hMsBiomes[Party_Girl][Hallow] = liked; hMsBiomes[Party_Girl][Underground] = disliked;
        hMsBiomes[Wizard][Hallow] = liked; hMsBiomes[Wizard][Ocean] = disliked;
        hMsBiomes[Demolitionist][Underground] = liked; hMsBiomes[Demolitionist][Ocean] = disliked;
        hMsBiomes[Goblin_Tinkerer][Underground] = liked; hMsBiomes[Goblin_Tinkerer][Jungle] = disliked;
        hMsBiomes[Clothier][Underground] = liked; hMsBiomes[Clothier][Hallow] = disliked;
        hMsBiomes[Dye_Trader][Desert] = liked; hMsBiomes[Dye_Trader][Forest] = disliked;
        hMsBiomes[Arms_Dealer][Desert] = liked; hMsBiomes[Arms_Dealer][Snow] = disliked;
        hMsBiomes[Steampunker][Desert] = liked; hMsBiomes[Steampunker][Jungle] = disliked;
        hMsBiomes[Dryad][Jungle] = liked; hMsBiomes[Dryad][Desert] = disliked;
        hMsBiomes[Painter][Jungle] = liked; hMsBiomes[Painter][Forest] = disliked;
        hMsBiomes[Witch_Doctor][Jungle] = liked; hMsBiomes[Witch_Doctor][Hallow] = disliked;
        hMsBiomes[Stylist][Ocean] = liked; hMsBiomes[Stylist][Snow] = disliked;
        hMsBiomes[Angler][Ocean] = liked; hMsBiomes[Angler][Desert] = disliked;
        hMsBiomes[Pirate][Ocean] = liked; hMsBiomes[Pirate][Underground] = disliked;
        hMsBiomes[Mechanic][Snow] = liked; hMsBiomes[Mechanic][Underground] = disliked;
        hMsBiomes[Tax_Collector][Snow] = liked; hMsBiomes[Tax_Collector][Hallow] = disliked;
        hMsBiomes[Cyborg][Snow] = liked; hMsBiomes[Cyborg][Jungle] = disliked;
        hMsBiomes[Truffle][Glowing_Mushroom] = liked; //Truffle: no disliked Biomes
        //Princess: no Biome preferences
        
        hMsNPCs[Guide][Clothier] = liked;
        hMsNPCs[Guide][Zoologist] = liked;
        hMsNPCs[Guide][Steampunker] = disliked;
        hMsNPCs[Guide][Painter] = hated;
        
        hMsNPCs[Merchant][Golfer] = liked;
        hMsNPCs[Merchant][Nurse] = liked;
        hMsNPCs[Merchant][Tax_Collector] = disliked;
        hMsNPCs[Merchant][Angler] = hated;
        
        hMsNPCs[Zoologist][Golfer] = liked;
        hMsNPCs[Zoologist][Witch_Doctor] = loved;
        hMsNPCs[Zoologist][Angler] = disliked;
        hMsNPCs[Zoologist][Arms_Dealer] = hated;
        
        hMsNPCs[Golfer][Painter] = liked;
        hMsNPCs[Golfer][Zoologist] = liked;
        hMsNPCs[Golfer][Angler] = loved;
        hMsNPCs[Golfer][Pirate] = disliked;
        hMsNPCs[Golfer][Merchant] = hated;
        
        hMsNPCs[Nurse][Wizard] = liked;
        hMsNPCs[Nurse][Arms_Dealer] = loved;
        hMsNPCs[Nurse][Party_Girl] = disliked;
        hMsNPCs[Nurse][Dryad] = disliked;
        hMsNPCs[Nurse][Zoologist] = hated;
        
        hMsNPCs[Tavernkeep][Goblin_Tinkerer] = liked;
        hMsNPCs[Tavernkeep][Demolitionist] = loved;
        hMsNPCs[Tavernkeep][Guide] = disliked;
        hMsNPCs[Tavernkeep][Dye_Trader] = hated;
        
        hMsNPCs[Party_Girl][Stylist] = liked;
        hMsNPCs[Party_Girl][Wizard] = loved;
        hMsNPCs[Party_Girl][Zoologist] = loved;
        hMsNPCs[Party_Girl][Merchant] = disliked;
        hMsNPCs[Party_Girl][Tax_Collector] = hated;
        
        hMsNPCs[Wizard][Merchant] = liked;
        hMsNPCs[Wizard][Golfer] = loved;
        hMsNPCs[Wizard][Witch_Doctor] = disliked;
        hMsNPCs[Wizard][Cyborg] = hated;
        
        hMsNPCs[Demolitionist][Mechanic] = liked;
        hMsNPCs[Demolitionist][Tavernkeep] = loved;
        hMsNPCs[Demolitionist][Goblin_Tinkerer] = disliked;
        hMsNPCs[Demolitionist][Arms_Dealer] = disliked;
        
        hMsNPCs[Goblin_Tinkerer][Dye_Trader] = liked;
        hMsNPCs[Goblin_Tinkerer][Mechanic] = loved;
        hMsNPCs[Goblin_Tinkerer][Clothier] = disliked;
        hMsNPCs[Goblin_Tinkerer][Stylist] = hated;
        
        hMsNPCs[Clothier][Tax_Collector] = liked;
        hMsNPCs[Clothier][Truffle] = loved;
        hMsNPCs[Clothier][Nurse] = disliked;
        hMsNPCs[Clothier][Mechanic] = hated;
        
        hMsNPCs[Dye_Trader][Arms_Dealer] = liked;
        hMsNPCs[Dye_Trader][Painter] = liked;
        hMsNPCs[Dye_Trader][Steampunker] = disliked;
        hMsNPCs[Dye_Trader][Pirate] = hated;
        
        hMsNPCs[Arms_Dealer][Steampunker] = liked;
        hMsNPCs[Arms_Dealer][Nurse] = loved;
        hMsNPCs[Arms_Dealer][Golfer] = disliked;
        hMsNPCs[Arms_Dealer][Demolitionist] = hated;
        
        hMsNPCs[Steampunker][Painter] = liked;
        hMsNPCs[Steampunker][Cyborg] = loved;
        hMsNPCs[Steampunker][Party_Girl] = disliked;
        hMsNPCs[Steampunker][Wizard] = disliked;
        hMsNPCs[Steampunker][Dryad] = disliked;
        
        hMsNPCs[Dryad][Witch_Doctor] = liked;
        hMsNPCs[Dryad][Truffle] = liked;
        hMsNPCs[Dryad][Angler] = disliked;
        hMsNPCs[Dryad][Golfer] = hated;
        
        hMsNPCs[Painter][Party_Girl] = liked;
        hMsNPCs[Painter][Dryad] = loved;
        hMsNPCs[Painter][Cyborg] = disliked;
        hMsNPCs[Painter][Truffle] = disliked;
        
        hMsNPCs[Witch_Doctor][Dryad] = liked;
        hMsNPCs[Witch_Doctor][Guide] = liked;
        hMsNPCs[Witch_Doctor][Nurse] = disliked;
        hMsNPCs[Witch_Doctor][Truffle] = hated;
        
        hMsNPCs[Stylist][Pirate] = liked;
        hMsNPCs[Stylist][Dye_Trader] = loved;
        hMsNPCs[Stylist][Tavernkeep] = disliked;
        hMsNPCs[Stylist][Goblin_Tinkerer] = hated;
        
        hMsNPCs[Angler][Party_Girl] = liked;
        hMsNPCs[Angler][Demolitionist] = liked;
        hMsNPCs[Angler][Tax_Collector] = liked;
        hMsNPCs[Angler][Tavernkeep] = hated;
        
        hMsNPCs[Pirate][Tavernkeep] = liked;
        hMsNPCs[Pirate][Angler] = loved;
        hMsNPCs[Pirate][Stylist] = disliked;
        hMsNPCs[Pirate][Guide] = hated;
        
        hMsNPCs[Mechanic][Cyborg] = liked;
        hMsNPCs[Mechanic][Goblin_Tinkerer] = loved;
        hMsNPCs[Mechanic][Arms_Dealer] = disliked;
        hMsNPCs[Mechanic][Clothier] = hated;
        
        hMsNPCs[Tax_Collector][Party_Girl] = liked;
        hMsNPCs[Tax_Collector][Merchant] = loved;
        hMsNPCs[Tax_Collector][Demolitionist] = disliked;
        hMsNPCs[Tax_Collector][Mechanic] = disliked;
        
        hMsNPCs[Cyborg][Stylist] = liked;
        hMsNPCs[Cyborg][Pirate] = liked;
        hMsNPCs[Cyborg][Steampunker] = liked;
        hMsNPCs[Cyborg][Zoologist] = disliked;
        hMsNPCs[Cyborg][Wizard] = hated;
        
        hMsNPCs[Truffle][Dryad] = liked;
        hMsNPCs[Truffle][Guide] = loved;
        hMsNPCs[Truffle][Clothier] = disliked;
        hMsNPCs[Truffle][Witch_Doctor] = hated;
        
        for(int i=0; i<hMsNPCs.length; i++) {
            hMsNPCs[Princess][i] = loved;
            hMsNPCs[i][Princess] = liked;
        }
        hMsNPCs[Princess][Princess] = 1;
    }
}
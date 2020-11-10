package net.mugmansnarutomod.client;

import net.minecraft.entity.player.PlayerEntity;

public class ClientTickHandler {
	public static final String EXT_PROP_NAME = "ChakraPlayer";
	
	public PlayerEntity player = null;
	
	//Cooldowns
	public int chakraCooldown;
	public int maxChakraRegTimer; //Time chakra takes to regen at its max
	public int maxChakra;
	public int redChakraCooldown;
	public int maxRedChakraRegTimer;
	public int maxRedChakra;
	public boolean isChakraFocus; //Is focusing to regen chakra
	//Points Stuff
	public int NinjaExperience;
	public int NinjaLevel;
	public int NinjaPoints;
	public int Health; //Health amount
	public double Ninjutsu;
	public double Taijutsu;
	public double Genjutsu;
	public double Fuinjutsu; //Sealing technique
	public double Speed;
	//World Stuff
	public int ClanID; //Clan IDs
	public int SecondClanID; //Second clan ID you can choose from
	//Clans
	public int Uchiha;
	public int Senju;
	public int Uzumaki;
	public int Hyuga;
	public int Nara;
	public int Akimichi;
	public int Inuzuka;
	public int Yamanaka;
	public int Haruno;
	public int Lee;
	public int Namikaze;
	public int Sarutobi;
	public int Jugo;
	//Kekkei Genkai aka Sharingan
	public int Sharingan;
	public int SharinganType;
	public int Rinnegan;
	public int Byakugan;
	public int ShaRinnegan;
	public int CelestialSharingan;
	public int RinneSharingan;
	//Provenance aka Konohagakure
	public int Konohagakure;
	public int Sunagakure;
	public int Kazegakure; //Wind
	public int Rainokuni; //Thunder
	public int Tsuchinokuni; //Earth
	public int Rengonokuni; //Union
	public int Iwagakure; //Rock
	public int Mizunokuni; //Water
	public int Kirigakure; //Mist
	public int Kumogakure; //Cloud
	//Affiliation aka Akatsuki
	public int HiddenLeaf;
	public int HiddenSand;
	public int WindVillage;
	public int ThunderVillage;
	public int EarthVillage;
	public int UnionVillage;
	public int HiddenRock;
	public int WaterVillage;
	public int HiddenMist;
	public int HiddenCloud;
	public int Akatsuki;
	public int HiddenSound;
	public int HiddenMemes;
	//Bijuu Stuff
	public int JinchurikiID; //ID of the Tailed Beast
	public boolean isJinchuriki; //Jinchuriki true or false
	public boolean BijuuTransformed; //Is player transformed
 	public boolean BijuuFormActive; //is Bijuu form active
	public int BijuuTransformTexture; //Bijuu respective form texture for transformed Jinchuriki
	public int BijuuTransformModel; //Bijuu respective form model for transformed Jinchuriki
	public int BijuuModel; //Model ID of the Tailed Beast
	public int TailedBeastType; //ID/Type of the tailed beast sealed within the player
	public int BijuuSealed;
	//Bijuu Other
	public int befriendingLevel;
	//Releases
	public int WindRelease;
	public int FireRelease;
	public int WaterRelease;
	public int LightningRelease;
	public int EarthRelease;
	//Kekkei Genkai Releases
	public int ScorchRelease;
	public int LavaRelease;
	public int BoilRelease;
	public int MagnetRelease;
	public int StormRelease;
	public int IceRelease;
	public int ExplosionRelease;
	public int SteelRelease;
	public int CrystalRelease;
	public int DustRelease;
	public int WoodRelease;
	public int Yinrelease;
	public int Yangrelease;
	public int Yinyangrelease;
	public int IchirakuRelease;
	//Basic Techniques
	public boolean chakraControl;
	//Techniques
	//Advanced Techniques
	
	public ClientTickHandler(PlayerEntity player) {
		this.player = player;
		this.maxChakra = 50; //Default maxChakra value
		this.chakraCooldown = 0;
		this.player.getDataManager();
		this.NinjaExperience = 0;
		this.NinjaLevel = 0;
		this.NinjaPoints = 0;
		this.Health = 0; //Health amount
		this.Ninjutsu = 1.0D;
		this.Taijutsu = 1.0D;
		this.Genjutsu = 1.0D;
		this.Fuinjutsu = 1.0D; //Sealing technique
		this.Speed = 1.0D;
		this.Sharingan = 0;
		this.SharinganType = 0;
		this.Rinnegan = 0;
		this.Byakugan = 0;
		this.ShaRinnegan = 0;
		this.CelestialSharingan = 0;
		this.RinneSharingan = 0;
		this.chakraControl = false;
		
	}
	
	public static final void register(PlayerEntity player) {
	}
	
}

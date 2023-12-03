package model;

import java.util.ArrayList;

public class QLTTModel {

	   private ArrayList<BenhNhan> DsThongTin;
	   public String LuaChon;

	   public QLTTModel() {
			this.DsThongTin=new ArrayList<BenhNhan>();
			this.LuaChon="";
		}
	  public QLTTModel(ArrayList<BenhNhan> DsThongTin) {
		this.DsThongTin=DsThongTin;
	}

	
	  public void setDsThongTin(ArrayList<BenhNhan> dsThongTin) {
			this.DsThongTin = dsThongTin;
		}
	  public ArrayList<BenhNhan> getDsThongTin() {
			return DsThongTin;
		}

	public String getLuaChon() {
		return LuaChon;
	}

	public void setLuaChon(String luaChon) {
		this.LuaChon = luaChon;
	}


	public void insert(BenhNhan benhNhan) {
		this.DsThongTin.add(benhNhan);
			
	}
	public void delete(BenhNhan benhNhan) {
		this.DsThongTin.remove(benhNhan);
	}
	public void update(BenhNhan benhNhan) {
		this.DsThongTin.remove(benhNhan);
		this.DsThongTin.add(benhNhan);
	}

	public boolean kiemTraTonTai(BenhNhan Bn) {
		for(BenhNhan benhnhan: DsThongTin) {
			if(benhnhan.getSTT() == Bn.getSTT())
				return true;
		}
		return false;
	}
	
	}




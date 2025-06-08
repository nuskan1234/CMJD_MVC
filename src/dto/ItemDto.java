package dto;

public class ItemDto {
    
    private String id;
    private String desc;
    private String pack;
    private double unitPrice;
    private int qoh;

    public ItemDto() {
    }

    public ItemDto(String id, String desc, String pack, double unitPrice, int qoh) {
        this.id = id;
        this.desc = desc;
        this.pack = pack;
        this.unitPrice = unitPrice;
        this.qoh = qoh;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPack() {
        return pack;
    }

    public void setPack(String pack) {
        this.pack = pack;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQoh() {
        return qoh;
    }

    public void setQoh(int qoh) {
        this.qoh = qoh;
    }

    @Override
    public String toString() {
        return "ItemDto{" + "id=" + id + ", desc=" + desc + ", pack=" + pack + ", unitPrice=" + unitPrice + ", qoh=" + qoh + '}';
    }

}



public class TransportZone {
    private int id;
    private String remark;

    public int getId() {
        return id;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark; //Почему здесь не надо getId? В семинаре здесь так и указано, я думаю что нужен гетИД, как в методе setStartZone
    }
}

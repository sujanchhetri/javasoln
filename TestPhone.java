public class TestPhone{
        public static void main(String[] args) {
                //cellphone object
                
                CellPhone cell = new CellPhone();
                
                //setting up cellphone object.
                cell.setCellProvider("AT&T");
                cell.setFlipPhone(true);
                cell.setHasInternational(true);
                cell.setBatteryType("NiCd");
                
                cell.addAFavoritePhoneNumber(1234567890L);
                cell.addAFavoritePhoneNumber(1987654321L);
                
                //priting using toStirng() method.
                System.out.println(cell);
                
                
                
                //SmartPhone object.
                SmartPhone smart = new SmartPhone();
                
                //setting up smart phone attrributes.
                smart.setHasGPS(true);
                smart.setHasWIFI(false);
                smart.setOSVersion("Apple iOS");
                
                //setting up cellphone for smart phone.
                CellPhone c = new CellPhone();
                c.setCellProvider("Apple");
                c.setFlipPhone(false);
                c.setHasInternational(true);
                c.setBatteryType("Lo-on");
                c.addAFavoritePhoneNumber(12345677890L);
                
                smart.setCellPhone(c);
                
                
                //printing smartphone using toString method.
                System.out.println(smart);
                
        }
}

import java.util.ArrayList;
import java.util.Arrays;

class CellPhone {
        // Attributes
        private final ArrayList<String> AVAILABLE_BATTERY_TYPES = new ArrayList<>(
                        Arrays.asList("NiCd", "NiMH", "Lo-ion", "Li-pol"));
        private ArrayList<Long> favoritePhoneNumbers = new ArrayList<Long>();

        private String cellProvider = "AT&T";
        private String batteryType = null;
        private boolean isFlipPhone = false;
        private boolean hasInternational = false;

        // Methods
        public ArrayList<Long> getFavoritePhoneNumbers() {
                return favoritePhoneNumbers;
        }

        public void addAFavoritePhoneNumber(Long phoneNumber) {
                this.favoritePhoneNumbers.add(phoneNumber);
        }

        public void deleteAFavoritePhoneNumber(int phoneNumber) {
                this.favoritePhoneNumbers.remove(phoneNumber);
        }

        public String getCellProvider() {
                return cellProvider;
        }

        public void setCellProvider(String cellProvider) {
                this.cellProvider = cellProvider;
        }

        public String getBatteryType() {
                return batteryType;
        }

        /**
         * Validates battery type
         * @param batteryType
         * @return
         */
        public boolean setBatteryType(String batteryType) {
                if (AVAILABLE_BATTERY_TYPES.contains(batteryType)) {
                        this.batteryType = batteryType;
                        return true;
                }
                return false;
        }

        public boolean isFlipPhone() {
                return isFlipPhone;
        }

        public void setFlipPhone(boolean isFlipPhone) {
                this.isFlipPhone = isFlipPhone;
        }

        public boolean isHasInternational() {
                return hasInternational;
        }

        public void setHasInternational(boolean hasInternational) {
                this.hasInternational = hasInternational;
        }

        public ArrayList<String> getAVAILABLE_BATTERY_TYPES() {
                return AVAILABLE_BATTERY_TYPES;
        }

        public boolean isValidBatteryType() {
                return batteryType != null;
        }
        
        @Override
        public String toString() {
                StringBuilder builder = new StringBuilder();
                builder.append("CellPhone [favoritePhoneNumbers=");
                builder.append(favoritePhoneNumbers);
                builder.append(", cellProvider=");
                builder.append(cellProvider);
                builder.append(", batteryType=");
                builder.append(batteryType);
                builder.append(", isFlipPhone=");
                builder.append(isFlipPhone);
                builder.append(", hasInternational=");
                builder.append(hasInternational);
                builder.append(", valid battery type=");
                builder.append(isValidBatteryType());
                builder.append("]");
                return builder.toString();
        }

}

class SmartPhone{
        
        //Attributes
        private boolean hasGPS;
        private boolean hasWIFI;
        private String OSVersion = "Windows 10 Mobile";
        private long internalMemoryStorageCapacity = 16_000_000_000L;
        private CellPhone cellPhone;
        
        //setters
        public void setCellPhone(CellPhone cellPhone) {
                this.cellPhone = cellPhone;
        }
        public void setHasGPS(boolean hasGPS) {
                this.hasGPS = hasGPS;
        }
        public void setHasWIFI(boolean hasWIFI) {
                this.hasWIFI = hasWIFI;
        }
        public void setInternalMemoryStorageCapacity(long internalMemoryStorageCapacity) {
                this.internalMemoryStorageCapacity = internalMemoryStorageCapacity;
        }
        public void setOSVersion(String oSVersion) {
                OSVersion = oSVersion;
        }
        
        
        //getters
        public CellPhone getCellPhone() {
                return cellPhone;
        }
        public long getInternalMemoryStorageCapacity() {
                return internalMemoryStorageCapacity;
        }
        public String getOSVersion() {
                return OSVersion;
        }
        public boolean isHasGPS() {
                return hasGPS;
        }
        public boolean isHasWIFI() {
                return hasWIFI;
        }
        
        @Override
        public String toString() {
                StringBuilder builder = new StringBuilder();
        builder.append("Smarthone ");
        builder.append("[isHasGPS = ");
        builder.append(isHasGPS());
        builder.append(", isHasWIFI = ");
        builder.append(isHasWIFI());
        builder.append(", OSVersion = ");
        builder.append(getOSVersion());
        builder.append(", Internal Memory Storage Capacity = ");
        builder.append(getInternalMemoryStorageCapacity());
        builder.append(", CellPhone = ");
        builder.append(getCellPhone());
        builder.append("]");
        return builder.toString();
        }
}



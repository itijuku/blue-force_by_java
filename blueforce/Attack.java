package blueforce;

public class Attack{
    private String chars = "1234567890qwertyuiopasdfghjklzxcvbnm";
    private String nowData = "";

    public Attack(String chars){
        this.chars = chars;
    }

    public String next(){
        if(this.nowData.isEmpty()){
            this.nowData = String.valueOf(this.chars.charAt(0));
        }else{
            int i = this.nowData.length()-1;
            StringBuilder lastData = new StringBuilder(this.nowData);
            while(i>=0 && this.nowData.charAt(i) == this.chars.charAt(this.chars.length()-1)){
                lastData.setCharAt(i,this.chars.charAt(0));
                i--;
            }

            this.nowData = lastData.toString();

            if(i<0){
                final int dataLength = this.nowData.length();
                this.nowData = "";
                for(int j=0;j<dataLength+1;j++){
                    nowData += String.valueOf(this.chars.charAt(0));
                }
            }else{
                int index = this.chars.indexOf(this.nowData.charAt(i));

                StringBuilder sb = new StringBuilder(this.nowData);
                sb.setCharAt(i,this.chars.charAt(index+1));

                this.nowData = sb.toString();
            }
        }

        return this.nowData;
    }
}

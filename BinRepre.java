class Solution{
    static String getBinaryRep(int N){
        // code here
        String binary = Integer.toBinaryString(N);
        StringBuilder sb = new StringBuilder();
        for (int i = binary.length(); i < 30; i++) {
            sb.append("0");
        }
        sb.append(binary);
        String binaryRepresentation = sb.toString();
        return binaryRepresentation;
    }
}
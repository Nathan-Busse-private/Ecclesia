private void isGoogleCertified

private boolean isGoogleCertified() {
    PackageManager pm = getPackageManager();
    String[] packages = {
            "com.google.android.gms",
            "com.google.android.gsf"
    };
        for (String packageName : packages){
            if (pm.checkSignatures(packageName, "com.google.android") != PackageManager.SIGNATURE_MATCH){
                return
                        false;
            }
        }
        return true;
}
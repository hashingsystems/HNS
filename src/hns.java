public class hns {
	String getAddressFromUrl(String username) {
		java.util.Hashtable<String, String> env = new java.util.Hashtable<String, String>();
		env.put("java.naming.factory.initial", "com.sun.jndi.dns.DnsContextFactory");
		try {
			javax.naming.directory.DirContext dirContext = new javax.naming.directory.InitialDirContext(env);
			javax.naming.directory.Attributes attrs = dirContext.getAttributes(username, new String[] { "TXT" });
			javax.naming.directory.Attribute attr = attrs.get("TXT");
			String userTxt = "";
			if(attr != null) {
				userTxt = attr.get().toString();
			}
			return userTxt;
		} catch (javax.naming.NamingException e) {
			e.printStackTrace();
			return "";
		}
	}
}


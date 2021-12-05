package solution;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {

	public int numUniqueEmails(String[] emails) {

		if (emails == null)
			return 0;

		Set<String> hashSetOfEmail = new HashSet<>();

		for (String email : emails) {

			StringBuilder sbEmail = new StringBuilder();

			for (char ch : email.toCharArray()) {

				if (ch == '.')
					continue;
				
				if (ch == '+')
					break;
				
				if (ch == '@')
					break;
				sbEmail.append(ch);
			}
			String filteredEmail = sbEmail.toString() + email.substring(email.indexOf('@'));
			hashSetOfEmail.add(filteredEmail);
		}

		return hashSetOfEmail.size();
	}
}

package solution;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {

	public int numUniqueEmails(String[] emails) {

		if (emails == null)
			return 0;

		Set<String> hashSet = new HashSet<>();

		for (String email : emails) {

			StringBuilder sbEmail = new StringBuilder();

			for (int i = 0; i < email.length(); i++) {

				char eachCharAtEmail = email.charAt(i);

				switch (eachCharAtEmail) {

				case '.':
					break;

				case '+':
					while (email.charAt(i) != '@') {
						eachCharAtEmail = email.charAt(++i);
					}
					sbEmail.append(email.substring(i));
					i = email.length();
					break;

				case '@':
					sbEmail.append(email.substring(i));
					i = email.length();
					break;

				default:
					sbEmail.append(eachCharAtEmail);

					/*
					 * Input: emails =
					 * ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com",
					 * "testemail+david@lee.tcode.com"]
					 */
				}
			}

			hashSet.add(sbEmail.toString());
		}

		return hashSet.size();
	}
}

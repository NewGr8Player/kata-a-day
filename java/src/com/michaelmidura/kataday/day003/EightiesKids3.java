package com.michaelmidura.kataday.day003;

import java.util.Arrays;
import java.util.Collections;

public class EightiesKids3 {

	public static String[] getSocks(String name, String[] socks) {
		if (name.equals("Henry"))
			for (String sock : socks)
				if (Collections.frequency(Arrays.asList(socks), sock) >= 2)
					return new String[]{sock, sock};
		if (name.equals("Punky"))
			for (String sock1 : socks)
				for (String sock2 : socks)
					if (!sock1.equals(sock2))
						return new String[]{sock1, sock2};
		return new String[0];
	}
}
package org.eclipse.regexp.ui;

import java.util.Map;
import java.util.regex.Pattern;

import com.google.common.collect.Maps;

public class RegexpUIConstants {

	public static final String PLUGIN_ID = "org.eclipse.regexp.ui";
	public static final String PREF_PAGE = PLUGIN_ID + ".prefs";

	public static final String ICONS = "icons/";
	public static final String ICONS_TOOLS = ICONS + "etool16/";
	public static final String SETTINGS_ICON = ICONS_TOOLS + "settings16.png";

	public static final String CANON_EQ = PLUGIN_ID + ".canon_eq";
	public static final String CASE_INSENSITIVE = PLUGIN_ID
			+ ".case_insensitive";
	public static final String COMMENTS = PLUGIN_ID + ".comments";
	public static final String DOTALL = PLUGIN_ID + ".dotall";
	public static final String LITERAL = PLUGIN_ID + ".literal";
	public static final String MULTILINE = PLUGIN_ID + ".multiline";
	public static final String UNICODE_CASE = PLUGIN_ID + ".unicode_case";
	public static final String UNIX_LINES = PLUGIN_ID + ".unix_lines";

	public static Map<String, Integer> FLAGS = Maps.newHashMap();

	static {
		FLAGS.put(CANON_EQ, Pattern.CANON_EQ);
		FLAGS.put(CASE_INSENSITIVE, Pattern.CASE_INSENSITIVE);
		FLAGS.put(COMMENTS, Pattern.COMMENTS);
		FLAGS.put(DOTALL, Pattern.DOTALL);
		FLAGS.put(LITERAL, Pattern.LITERAL);
		FLAGS.put(MULTILINE, Pattern.MULTILINE);
		FLAGS.put(UNICODE_CASE, Pattern.UNICODE_CASE);
		FLAGS.put(UNIX_LINES, Pattern.UNIX_LINES);
	}
}
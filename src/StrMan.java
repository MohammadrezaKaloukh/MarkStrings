public class StrMan {
    //An Example for ==> String what="\\*,\\<,\\>,\\-,\\\\,\\!,\\ ,\\\",\\/,\\',\\:,\\;,\\[,\\]";
    public static String strRepalcerMark(String originText,String what,String with)
    {		return originText.replaceAll("["+what+"]", with).trim();
    }

    public static boolean isValidFilename(String fileName)
    {final char[] badChars = { '/', '\n', '\r', '\t', '\0', '\f', '`', '?', '*', '\\', '<', '>', '|', '\"', ':' };
        if (fileName==null ||  fileName.isEmpty()|| fileName.charAt(0)==' ')
            return false;
        else
            for(int counter=0;counter<badChars.length;counter++)
                if (fileName.indexOf(badChars[counter])>0)
                    return false;
        return true;
    }
}

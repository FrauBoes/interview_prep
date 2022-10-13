import java.util.*;

class SubDomainVisitCount {
    public static List<String> subdomainVisits(String[] cpdomains) {

        var map = new HashMap<String, Integer>();

        for (int i = 0; i < cpdomains.length; i++) {
            String[] split = cpdomains[i].split(" ");
            int count = Integer.valueOf(split[0]);
            String domain = split[1];

            map.merge(domain, count, Integer::sum);

            while (domain.indexOf(".") != -1) {
                int j = domain.indexOf(".");
                domain = domain.substring(j + 1);
                map.merge(domain, count, Integer::sum);
            }
        }

        var result = new ArrayList<String>();

        map.forEach((k, v) -> {
            var sb = new StringBuilder(String.valueOf(v));
            sb.append(" ");
            sb.append(k);
            result.add(sb.toString());
        });

        return result;
    }

    public static void main(String[] args) {
        System.out.println(subdomainVisits(new String[] {"9001 discuss.leetcode.com"}));
    }
}

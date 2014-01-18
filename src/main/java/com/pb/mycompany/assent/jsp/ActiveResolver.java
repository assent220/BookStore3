package com.pb.mycompany.assent.jsp;

import javax.servlet.http.HttpServletRequest;
import org.springframework.web.util.UrlPathHelper;

/**
 *
 * @author assent2
 */
public class ActiveResolver {

    public static class Authors {

        private final String pageName;
        private final String activeClass;

        public Authors(HttpServletRequest request, String activeClass) {
            UrlPathHelper urlPathHelper = new UrlPathHelper();


//            System.out.println(new UrlPathHelper().getContextPath(request));
//            System.out.println(new UrlPathHelper().getLookupPathForRequest(request));
//            System.out.println(new UrlPathHelper().getOriginatingContextPath(request));
//            System.out.println(new UrlPathHelper().getOriginatingQueryString(request));
//            System.out.println(new UrlPathHelper().getOriginatingRequestUri(request));
//            System.out.println(new UrlPathHelper().getOriginatingServletPath(request));
//            System.out.println(new UrlPathHelper().getPathWithinApplication(request));
//            System.out.println(new UrlPathHelper().getPathWithinServletMapping(request));
//            System.out.println(new UrlPathHelper().getRequestUri(request));
//            System.out.println(new UrlPathHelper().getServletPath(request));

            String urlQuery = urlPathHelper.getOriginatingQueryString(request);
            String str;
            if (urlQuery == null || urlQuery.trim().isEmpty()) {
                str = urlPathHelper.getOriginatingRequestUri(request);
            } else {
                str = urlPathHelper.getOriginatingRequestUri(request) + "?" + urlPathHelper.getOriginatingQueryString(request);
            }

            String pattern_proj = "/[-a-zA-z0-9_.:]+/";
            pageName = str.replaceFirst(pattern_proj, "");
            this.activeClass = activeClass;
        }

        public String isAll() {
            String pattern = "[a-zA-Z0-9]+/all";

            if (pageName.matches(pattern)) {
                return activeClass;
            }
            return "";
        }

        public String isFind() {
            String pattern = "[a-zA-Z0-9]+/find";

            if (pageName.matches(pattern)) {
                return activeClass;
            }
            return "";
        }

        public String isEdit() {
            String pattern = "[a-zA-Z0-9]+/\\d+\\?form";

            if (pageName.matches(pattern)) {
                return activeClass;
            }
            return "";
        }

        public String isShow() {
            String pattern = "";

            if (pageName.matches(pattern)) {
                return activeClass;
            }
            return "";
        }
    }
}

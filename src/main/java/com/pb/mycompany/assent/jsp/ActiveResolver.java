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
            String str = new UrlPathHelper().getOriginatingRequestUri(request);
            String pattern_proj = "/[-a-zA-z0-9_.:]+/";
            pageName = str.replaceFirst(pattern_proj, "");
            this.activeClass = activeClass;
        }

        public String isList() {
            String pattern = "[a-zA-Z0-9]+/?";

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
            String pattern1 = "[a-zA-Z0-9]+/\\d+\\?form";
            String pattern2 = "[a-zA-Z0-9]+/form";

            if (pageName.matches(pattern1) || pageName.matches(pattern2)) {
                return activeClass;
            }
            return "";
        }

        public String isShow() {
            String pattern = "[a-zA-Z0-9]+/?\\d+";

            if (pageName.matches(pattern)) {
                return activeClass;
            }
            return "";
        }
    }
}

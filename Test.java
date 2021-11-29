import org.apache.commons.text.StringEscapeUtils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

public class Test {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String cspHeader="<meta data-react-helmet=\"true\" http-equiv=\"Content-Security-Policy\" content=\"default-src &#x27;self&#x27; ; script-src &#x27;self&#x27; &#x27;unsafe-eval&#x27; &#x27;unsafe-inline&#x27; blob: https://cdn.segment.com/analytics.js/v1/ https://cmp.osano.com/Azyw89S0I2gFuR2v/ed684bc0-8fdd-4609-af23-b196e28e7021/osano.js https://platform.twitter.com/js/ https://platform.twitter.com/widgets.js https://player.vimeo.com/api/player.js https://www.youtube.com/iframe_api https://www.youtube.com/s/player/ ; style-src &#x27;self&#x27; &#x27;unsafe-inline&#x27; ; object-src &#x27;none&#x27; ; base-uri &#x27;self&#x27; ; connect-src &#x27;self&#x27; https://static.figma.com https://forms.figma.com https://api.lever.co https://api.segment.io https://vimeo.com https://disclosure.api.osano.com https://tattle.api.osano.com https://consent.api.osano.com ; frame-src &#x27;self&#x27; https://www.figma.com https://marketing.figma.com https://staging-marketing.figma.com https://platform.twitter.com https://player.vimeo.com https://www.youtube.com https://cmp.osano.com ; img-src &#x27;self&#x27; data: https://cdn.sanity.io https://i.vimeocdn.com https://*.figma.com https://i.ytimg.com https://www.gravatar.com https://i0.wp.com/s3-alpha.figma.com/ https://i1.wp.com/s3-alpha.figma.com/ https://i2.wp.com/s3-alpha.figma.com/ https://i3.wp.com/s3-alpha.figma.com/ ; media-src &#x27;self&#x27; https://cdn.sanity.io ; worker-src &#x27;none&#x27;\"/>";
        System.out.println("Output:                       "+StringEscapeUtils.unescapeHtml4(cspHeader));
        String cspHeaderNoEncoding="<meta data-react-helmet=\"true\" http-equiv=\"Content-Security-Policy\" content=\"default-src 'self' ; script-src 'self' 'unsafe-eval' 'unsafe-inline' blob: https://cdn.segment.com/analytics.js/v1/ https://cmp.osano.com/Azyw89S0I2gFuR2v/ed684bc0-8fdd-4609-af23-b196e28e7021/osano.js https://platform.twitter.com/js/ https://platform.twitter.com/widgets.js https://player.vimeo.com/api/player.js https://www.youtube.com/iframe_api https://www.youtube.com/s/player/ ; style-src 'self' 'unsafe-inline' ; object-src 'none' ; base-uri 'self' ; connect-src 'self' https://static.figma.com https://forms.figma.com https://api.lever.co https://api.segment.io https://vimeo.com https://disclosure.api.osano.com https://tattle.api.osano.com https://consent.api.osano.com ; frame-src 'self' https://www.figma.com https://marketing.figma.com https://staging-marketing.figma.com https://platform.twitter.com https://player.vimeo.com https://www.youtube.com https://cmp.osano.com ; img-src 'self' data: https://cdn.sanity.io https://i.vimeocdn.com https://*.figma.com https://i.ytimg.com https://www.gravatar.com https://i0.wp.com/s3-alpha.figma.com/ https://i1.wp.com/s3-alpha.figma.com/ https://i2.wp.com/s3-alpha.figma.com/ https://i3.wp.com/s3-alpha.figma.com/ ; media-src 'self' https://cdn.sanity.io ; worker-src 'none'\"/>";
        System.out.println("Output already decoded:       "+StringEscapeUtils.unescapeHtml4(cspHeaderNoEncoding));


    }
}

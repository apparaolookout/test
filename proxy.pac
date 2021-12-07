function FindProxyForURL(url, host) {
	var proxy_no = "DIRECT";

        var proxy_yes = "PROXY 127.0.0.1:443";
        var proxy_list = Array(

            

            "*figma.com"
            




            

        );
        for(var iter = 0; iter < proxy_list.length; ++iter) {
            if(shExpMatch(host, proxy_list[iter])) {
                return proxy_yes;
            }
        }

        var ztna_proxy_yes = "PROXY fp-z-ccmse.ciphercloud.io:443";
        var ztna_proxy_list = Array(
             // Cloud: enterprise_apps
             "*cortex.dev.ciphercloud.in",
             "*tomcat.sas.ciphercloud.in",
             "*crm.ccidcqa.com",
             "*guac.dev.ciphercloud.in",
             "*ztra-centos-2"
            
        );

        for(var iter = 0; iter < ztna_proxy_list.length; ++iter) {
            if(shExpMatch(host, ztna_proxy_list[iter])) {
                return ztna_proxy_yes;
            }
        }

    // All other requests go directly:
    return proxy_no;
}
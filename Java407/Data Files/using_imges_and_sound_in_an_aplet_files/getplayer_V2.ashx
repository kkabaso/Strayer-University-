document.write('<div id="DLMediaf2e5dcb3-680b-4bd1-bd72-a5bc2154033c"></div>');
(function(){
	
//    var gscri = document.createElement("script");
//    gscri.type = "text/javascript";
//    gscri.src = "http://q-media.delmar.cengage.com/delmedia/include/GATracker.js";
//    document.getElementsByTagName("head")[0].appendChild(gscri);
	
    if (!(window.jQuery)) {
        var script = document.createElement("script");
        script.type = "text/javascript";
 
        if (script.readyState) { //IE
            script.onreadystatechange = function () {
                if (script.readyState == "loaded" || script.readyState == "complete") {
                    script.onreadystatechange = null;
                    initPlayer();
                }
            };
        } 
        else { //Others
            script.onload = function () {
                initPlayer();
            };
        }
 
        script.src = "http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js";
        document.getElementsByTagName("head")[0].appendChild(script);
    }
    else{
        initPlayer();
    }

    function initPlayer(){
	    jQuery().ready(function() {
		    LoadPlayerScript();
		    jQuery("#DLMediaf2e5dcb3-680b-4bd1-bd72-a5bc2154033c").after("<div class=\"media-transcript-download\"><a href=\"http://media.delmar.cengage.com/DelMedia/GetTranscript.ashx?dl=1&pid=f2e5dcb3-680b-4bd1-bd72-a5bc2154033c\" target=\"_blank\">Download Transcript</a></div>");
	    });
    }

	function LoadPlayerScript(){
		if(typeof jwplayer=="undefined")
		{
			jQuery.getScript(
				"http://media.delmar.cengage.com/delmedia/JWPlayer/jwplayer.js",
				function(){
					DisplayPreview();
				}
			);
		} else {
			DisplayPreview();
		}
	}

	function DisplayPreview()
	{
		if(typeof jwplayer=="undefined")
		{
			LoadPlayerScript();
		} else {
            jQuery().ready(function() {
			    jwplayer("DLMediaf2e5dcb3-680b-4bd1-bd72-a5bc2154033c").setup(
				    {
					    "id": "f2e5dcb3-680b-4bd1-bd72-a5bc2154033c",
					    "width": "600",
					    "height": "375",
					    "controlbar": "bottom",
					    "events": { /*EVENTS*/ },
					    "provider":"rtmp","streamer":"rtmp://flash.delmar.cengage.com/DLvideo/","file":"/00/01/57/15702.flv","image":"http://flash.delmar.cengage.com/DLvideo/00/01/57/15702.jpg","duration":274,"autostart":false,"modes":[{"type":"flash","src":"http://media.delmar.cengage.com/delmedia/JWPlayer/player.swf"},{"type":"html5","config":{"file":"http://flash.delmar.cengage.com/DLvideo/00/01/57/15702.mp4","provider":"video","controls":"controls"}}],"plugins":{"gapro-2":{"trackstarts":true,"trackpercentage":true,"trackseconds":true}}

				    }
			    );
            });
		}
	}

})();

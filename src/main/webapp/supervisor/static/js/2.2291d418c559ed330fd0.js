webpackJsonp([2],{139:function(t,e,o){!function(e,o){t.exports=o()}(0,function(){return function(t){function e(i){if(o[i])return o[i].exports;var r=o[i]={i:i,l:!1,exports:{}};return t[i].call(r.exports,r,r.exports,e),r.l=!0,r.exports}var o={};return e.m=t,e.c=o,e.i=function(t){return t},e.d=function(t,o,i){e.o(t,o)||Object.defineProperty(t,o,{configurable:!1,enumerable:!0,get:i})},e.n=function(t){var o=t&&t.__esModule?function(){return t.default}:function(){return t};return e.d(o,"a",o),o},e.o=function(t,e){return Object.prototype.hasOwnProperty.call(t,e)},e.p="",e(e.s=12)}({0:function(t,e,o){"use strict";t.exports={isMobile:/Android|webOS|iPhone|iPad|iPod|BlackBerry|IEMobile|Opera Mini/i.test(navigator.userAgent),setCssText:function(t){var e=[];for(var o in t){var i=t[o];"number"==typeof i&&(i+="px"),e.push(o+": "+i+";")}return e.join("")}}},12:function(t,e,o){"use strict";function i(t,e,o){if(e){var i=a?t.changedTouches[0].clientX:t.clientX,r=a?t.changedTouches[0].clientY:t.clientY,n=i-e.parentElement.offsetLeft-o.x,s=r-e.parentElement.offsetTop-document.getElementsByClassName("image-aside")[0].offsetTop-o.y;return n<=0&&(n=0),n>=o.maxLeft&&(n=o.maxLeft),s<=0&&(s=0),s>=o.maxTop&&(s=o.maxTop),{left:n,top:s}}}Object.defineProperty(e,"__esModule",{value:!0}),e.default=i;var r=o(0),n=function(t){return t&&t.__esModule?t:{default:t}}(r),a=n.default.isMobile}})})},140:function(t,e,o){!function(e,o){t.exports=o()}(0,function(){return function(t){function e(i){if(o[i])return o[i].exports;var r=o[i]={i:i,l:!1,exports:{}};return t[i].call(r.exports,r,r.exports,e),r.l=!0,r.exports}var o={};return e.m=t,e.c=o,e.i=function(t){return t},e.d=function(t,o,i){e.o(t,o)||Object.defineProperty(t,o,{configurable:!1,enumerable:!0,get:i})},e.n=function(t){var o=t&&t.__esModule?function(){return t.default}:function(){return t};return e.d(o,"a",o),o},e.o=function(t,e){return Object.prototype.hasOwnProperty.call(t,e)},e.p="",e(e.s=0)}([function(t,e,o){"use strict";t.exports={isMobile:/Android|webOS|iPhone|iPad|iPod|BlackBerry|IEMobile|Opera Mini/i.test(navigator.userAgent),setCssText:function(t){var e=[];for(var o in t){var i=t[o];"number"==typeof i&&(i+="px"),e.push(o+": "+i+";")}return e.join("")}}}])})},141:function(t,e,o){!function(e,o){t.exports=o()}(0,function(){return function(t){function e(i){if(o[i])return o[i].exports;var r=o[i]={i:i,l:!1,exports:{}};return t[i].call(r.exports,r,r.exports,e),r.l=!0,r.exports}var o={};return e.m=t,e.c=o,e.i=function(t){return t},e.d=function(t,o,i){e.o(t,o)||Object.defineProperty(t,o,{configurable:!1,enumerable:!0,get:i})},e.n=function(t){var o=t&&t.__esModule?function(){return t.default}:function(){return t};return e.d(o,"a",o),o},e.o=function(t,e){return Object.prototype.hasOwnProperty.call(t,e)},e.p="",e(e.s=13)}({13:function(t,e,o){"use strict";Object.defineProperty(e,"__esModule",{value:!0}),e.default="data:image/gif;base64,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"}})})},142:function(t,e,o){"use strict";function i(t){return t&&t.__esModule?t:{default:t}}Object.defineProperty(e,"__esModule",{value:!0});var r=o(139),n=i(r),a=o(536),s=i(a),c=o(141),u=i(c),l=o(140),p=i(l);e.default={props:{formId:{type:String,default:""},ratio:{type:String,default:"1:1"},minWidth:{type:Number,default:50},minHeight:{type:Number,default:50},hideCrop:{type:[String,Boolean],default:!1}},data:function(){return{src:u.default,width:24,height:24,cropCSS:{}}},methods:{setImage:function(t,e,o){return this.src=t,this.ratio.indexOf(":")>0?(this.ratioW=this.ratio.split(":")[0],this.ratioH=this.ratio.split(":")[1],this.ratioVal=this.ratioW/this.ratioH):(this.ratioW=1,this.ratioH=1,this.ratioVal=this.ratio),this.setLayout(e,o),this.setCropBox(),this.natrualWidth=e,this.natrualHeight=o,this.imgChangeRatio},resizeImage:function(t){var e=this.natrualWidth*this.imgChangeRatio*t,o=this.natrualHeight*this.imgChangeRatio*t;e<=this.minWidth||o<this.minHeight||(this._setStyle(e,o,e/o),this.setCropBox())},setLayout:function(t,e){var o=window.innerHeight-80,i=window.innerWidth-60,r=t,n=e,a=0,s=r/n;s>i/o?(r=i,n=i/s,a=(o-i/s)/2):(r=o*s,n=o,a=(i-o*s)/2),this.marginLeft=a,this.marginTop=0,this.imgChangeRatio=r/t,this._setStyle(r,n,s,!0)},_setStyle:function(t,e,o,i){var r=this.$el;i||(this.marginLeft=this.marginLeft+(this.width-t)/2,this.marginTop=this.marginTop+(this.height-e)/2),r.style.cssText="width:"+t+"px;height:"+e+"px;margin-left:"+this.marginLeft+"px;margin-top:"+this.marginTop+"px",this.width=t,this.height=e},setCropBox:function(){if(!this.hideCrop){var t=this.__find(".crop-box"),e=(this.$el,this.width),o=this.height,i=this.ratioW,r=this.ratioH,n=e/100*75,a={width:n,height:n/i*r};if(a.left=(e-n)/2,a.top=(o-a.height)/2,t.style.cssText=p.default.setCssText(a),a.height>o){var s=o/100*75;a.height=s,a.width=a.height*i/r,a.left=(e-a.width)/2,a.top=(o-a.height)/2,t.style.cssText=p.default.setCssText(a)}this.cropCSS=a}},getCropData:function(){return this.hideCrop?{imgChangeRatio:this.imgChangeRatio,toCropImgX:0,toCropImgY:0,toCropImgW:this.natrualWidth,toCropImgH:this.natrualHeight}:{toCropImgX:this.cropCSS.left/this.imgChangeRatio,toCropImgY:this.cropCSS.top/this.imgChangeRatio,toCropImgW:this.cropCSS.width/this.imgChangeRatio,toCropImgH:this.cropCSS.height/this.imgChangeRatio}},getCropImage:function(){return this.$refs["crop-image"]},__find:function(t){return document.querySelector("#vciu-modal-"+this.formId).querySelector(t)},resize:function(t){t.stopPropagation();var e=t.target.parentElement,o=this.__find(".g-crop-image-principal");this._$container&&(this._$container=container);var i=this,r={x:p.default.isMobile?t.touches[0].clientX:t.clientX,y:p.default.isMobile?t.touches[0].clientY:t.clientY,w:parseInt(window.getComputedStyle(e).width,10),h:parseInt(window.getComputedStyle(e).height,10)};this.el=e,this.container=o;var n=function(t){var e=(0,s.default)(t,i.el,o,r,i.ratioVal);e&&(i.cropCSS.width=e.width,i.cropCSS.height=e.height)},a=function t(e){this.el=null,p.default.isMobile&&(document.removeEventListener("touchmove",n,!1),document.removeEventListener("touchend",t,!1)),document.removeEventListener("mousemove",n,!1),document.removeEventListener("mouseup",t,!1)};p.default.isMobile&&(document.addEventListener("touchmove",n,!1),document.addEventListener("touchend",a,!1)),document.addEventListener("mousemove",n,!1),document.addEventListener("mouseup",a,!1)},drag:function(t){t.preventDefault();var e=t.target;this.el=e;var o=this.$el,i=document.getElementsByClassName("image-aside")[0],r=this,a=p.default.isMobile,s={x:(a?t.touches[0].clientX:t.clientX)-e.offsetLeft-e.parentElement.offsetLeft-i.offsetLeft,y:(a?t.touches[0].clientY:t.clientY)-e.offsetTop-e.parentElement.offsetTop-i.offsetTop,posX:a?t.touches[0].clientX:t.clientX,posy:a?t.touches[0].clientY:t.clientY,maxLeft:parseInt(o.style.width)-parseInt(e.style.width),maxTop:parseInt(o.style.height)-parseInt(e.style.height)},c=function(t){var e=(0,n.default)(t,r.el,s);e&&(r.cropCSS.left=e.left,r.cropCSS.top=e.top)},u=function t(e){if(r.el=null,a)return document.removeEventListener("touchmove",c,!1),void document.removeEventListener("touchend",t,!1);document.removeEventListener("mousemove",c,!1),document.removeEventListener("mouseup",t,!1)};if(a)return document.addEventListener("touchmove",c,!1),void document.addEventListener("touchend",u,!1);document.addEventListener("mousemove",c,!1),document.addEventListener("mouseup",u,!1)}}}},143:function(t,e,o){"use strict";function i(t){return t&&t.__esModule?t:{default:t}}Object.defineProperty(e,"__esModule",{value:!0});var r=o(140),n=i(r),a=o(139),s=i(a);e.default={props:{minProgress:{type:[Number,String],default:0}},data:function(){return{progress:100,left:100}},methods:{setRatio:function(t){this.progress=100,this.left=100},drag:function(t){t.preventDefault();var e=t.target;this.el=e;var o=this.$el.parentElement,i=this,r=n.default.isMobile,a=document.querySelector(".g-resize-bar").offsetWidth,c={x:(r?t.touches[0].clientX:t.clientX)-e.offsetLeft-e.parentElement.offsetLeft,y:(r?t.touches[0].clientY:t.clientY)-e.offsetTop-e.parentElement.offsetTop,posX:r?t.touches[0].clientX:t.clientX,posy:r?t.touches[0].clientY:t.clientY,maxLeft:a,maxTop:parseInt(o.style.height)-parseInt(e.style.height)},u=function(t){var e=(0,s.default)(t,i.el,c);if(e){if(e.left/a<i.minProgress)return;i.progress=e.left/a,i.left=e.left/a*100,i.$emit("resize",i.progress)}},l=function t(e){if(i.el=null,r)return document.removeEventListener("touchmove",u,!1),void document.removeEventListener("touchend",t,!1);document.removeEventListener("mousemove",u,!1),document.removeEventListener("mouseup",t,!1)};if(r)return document.addEventListener("touchmove",u,!1),void document.addEventListener("touchend",l,!1);document.addEventListener("mousemove",u,!1),document.addEventListener("mouseup",l,!1)}}}},144:function(t,e,o){"use strict";function i(t){return t&&t.__esModule?t:{default:t}}Object.defineProperty(e,"__esModule",{value:!0});var r="function"==typeof Symbol&&"symbol"==typeof Symbol.iterator?function(t){return typeof t}:function(t){return t&&"function"==typeof Symbol&&t.constructor===Symbol&&t!==Symbol.prototype?"symbol":typeof t},n=o(537),a=i(n),s=o(141),c=i(s),u=o(535),l=i(u),p=o(538),d=i(p),h=o(539),f=i(h),g=o(540),m=i(g);e.default={components:{Crop:f.default,ResizeBar:m.default},props:d.default,data:function(){return{files:[],hasImage:!1,options:this.props,uploading:!1,formID:(1e4*Math.random()+"").split(".")[0],image:{src:c.default,width:24,height:24,minProgress:.05}}},computed:{name:function(){return this.multiple?this.inputOfFile+"[]":this.inputOfFile}},methods:{__dispatch:function(t,e){this.$emit&&this.$emit(t,e)},__find:function(t){return document.querySelector("#vciu-modal-"+this.formID).querySelector(t)},change:function(t){var e=this,o=document.querySelector("#g-core-upload-input-"+this.formID).value.replace(/C:\\fakepath\\/i,""),i=o.substring(o.lastIndexOf(".")+1),r=this.extensions.split(",");if(r.length>1){if(!new RegExp("^["+r.join("|")+"]+$","i").test(i))return this.__dispatch("errorhandle","TYPE ERROR")}if(t.target.files[0].size>this.maxFileSize){var n;return n=parseInt(this.maxFileSize/1024/1024)>0?(this.maxFileSize/1024/1024).toFixed(2)+"MB":parseInt(this.maxFileSize/1024)>0?(this.maxFileSize/1024).toFixed(2)+"kB":options.maxFileSize.toFixed(2)+"Byte",console.warn("FILE IS TOO LARGER MAX FILE IS "+n),this.__dispatch("errorhandle","FILE IS TOO LARGER MAX FILE IS "+n)}if(this.files=t.target.files,this.crop||this.resize)return void this.__showImage();this.__dispatch("imagechanged",this.files[0]),this.compress?l.default.compress(this.files[0],100-this.compress,function(t){e.tryAjaxUpload("",!0,t)}):this.tryAjaxUpload()},__showImage:function(){this.hasImage=!0,this.__readFiles()},__readFiles:function(){var t=new FileReader,e=this;t.onload=function(t){var o=t.target.result;e.__initImage(o)},t.readAsDataURL(this.files[0])},__initImage:function(t){var e=new Image,o=this;e.src=t;var i=this.$refs.cropBox,r=this.$refs.resizeBar;e.onload=function(){o.image.minProgress=o.minWidth/e.naturalWidth,o.imgChangeRatio=i.setImage(t,e.naturalWidth,e.naturalHeight),r&&r.setRatio(o.imgChangeRatio)}},resizeImage:function(t){this.$refs.cropBox.resizeImage(t)},doCrop:function(t){this.__setData("crop");var e=this.$refs.cropBox,o=this.__setUpload(t.target);if("local"===this.crop){var i=e.getCropImage();return this.data.comprose=100-this.compress,l.default.crop(i,this.data,function(t){o(t)})}o()},doResize:function(t){this.__setData("reszie");var e=this.$refs.cropBox,o=this.__setUpload(t.target);if("local"===this.resize){var i=e.getCropImage();return this.data.comprose=100-this.compress,l.default.resize(i,this.data,function(t){o(t)})}o()},__setData:function(t){"object"!==r(this.data)&&(this.data={}),this.data.request=t;var e=this.$refs.cropBox,o=e.getCropData(),i=!0,n=!1,a=void 0;try{for(var s,c=Object.keys(o)[Symbol.iterator]();!(i=(s=c.next()).done);i=!0){var u=s.value;this.data[u]=o[u]}}catch(t){n=!0,a=t}finally{try{!i&&c.return&&c.return()}finally{if(n)throw a}}this.maxWidth&&(this.data.maxWidth=this.maxWidth),this.maxHeight&&(this.data.maxHeight=this.maxHeight),this.minWidth&&(this.data.minWidth=this.minWidth)},__setUpload:function(t){var e=this;return t.value=t.value+"...",t.disabled=!0,function(o){e.tryAjaxUpload(function(){t.value=t.value.replace("...",""),t.disabled=!1},!!o,o)}},cancel:function(){this.hasImage=!1,this.files="",document.querySelector("#g-core-upload-input-"+this.formID).value=""},tryAjaxUpload:function(t,e,o){var i=this;this.__dispatch("imageuploading",this.files[0]);var n=function(e){"function"==typeof t&&t(),i.uploading=!1,i.cancel(),i.__dispatch("imageuploaded",e)},s=function(t){i.__dispatch("errorhandle",t)};if(!this.isXhr)return this.crop&&(this.hasImage=!1),"function"==typeof t&&t();var c=void 0;if(e)c={type:this.files[0].type,filename:this.files[0].name,filed:this.inputOfFile,base64Code:o},"object"===r(this.data)&&(c=Object.assign(this.data,c));else{c=new FormData;for(var u=0;u<this.files.length;u++)c.append(this.name,this.files[u]);if("object"===r(this.data))for(var l in this.data)void 0!==this.data[l]&&c.append(l,this.data[l])}(0,a.default)("POST",this.url,this.headers,c,n,s,e)}}}},157:function(t,e,o){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var i=o(534);e.default={data:function(){return{src:"../../../static/img/img.jpg",fileList:[]}},components:{VueCoreImageUpload:i.a},methods:{imageuploaded:function(t){console.log(t)},handleRemove:function(t,e){console.log(t,e)},handlePreview:function(t){console.log(t)},handleError:function(){this.$notify.error({title:"上传失败",message:"图片上传接口上传失败，可更改为自己的服务器接口"})}}}},252:function(t,e,o){e=t.exports=o(7)(),e.push([t.i,".content-title[data-v-28010e39]{font-weight:400;line-height:50px;margin:10px 0;font-size:22px;color:#1f2f3d}.pre-img[data-v-28010e39]{width:250px;height:250px;margin-bottom:20px}",""])},253:function(t,e,o){e=t.exports=o(7)(),e.push([t.i,".g-core-image-upload-btn{position:relative;overflow:hidden}.g-core-image-upload-form{position:absolute;left:0;right:0;top:0;bottom:0;opacity:0}.g-core-image-upload-container{position:absolute;background:#111;z-index:900}.g-core-image-upload-modal{position:absolute;left:0;right:0;width:100%;height:100%;border:1px solid #ccc;z-index:899}.dropped{border:4px solid #ea6153}.g-core-image-corp-container{z-index:1900;position:fixed;left:0;right:0;top:0;bottom:0;background:rgba(0,0,0,.9);color:#f1f1f1}.g-core-image-corp-container .image-aside{position:absolute;right:30px;left:30px;top:60px;bottom:20px;text-align:center}.g-core-image-corp-container .image-aside img{max-width:100%;-webkit-touch-callout:none;-webkit-user-select:none;-khtml-user-select:none;-moz-user-select:none;-ms-user-select:none;user-select:none}.g-core-image-corp-container .info-aside{position:absolute;left:0;right:0;top:0;height:40px;padding-left:10px;padding-right:10px;background:#fefefe;color:#777}.g-core-image-corp-container .btn-groups{text-align:right;margin:5px 0 0}.g-core-image-corp-container .btn{display:inline-block;padding:0 15px;height:32px;margin-left:15px;background:#fff;border:1px solid #ccc;border-radius:2px;font-size:13px;color:#222;line-height:32px;transition:all .1s ease-in}.g-core-image-corp-container .btn:hover{border:1px solid #777;box-shadow:0 1px 3px rgba(0,0,0,.05)}.g-core-image-corp-container .btn:active{background:#ddd}.g-core-image-corp-container .btn:disabled{background:#eee!important;border-color:#ccc;cursor:not-allowed}.g-core-image-corp-container .btn-upload{background:#27ae60;border-color:#27ae60;color:#fff}.g-core-image-corp-container .btn-upload:hover{background:#2dc26c;border-color:#27ae60;box-shadow:0 1px 3px rgba(0,0,0,.05)}.g-core-image-corp-container .g-crop-image-box,.g-core-image-corp-container .g-crop-image-box .g-crop-image-principal{position:relative}",""])},261:function(t,e,o){e=t.exports=o(7)(),e.push([t.i,".g-resize-bar[data-v-cd2d7ce2]{position:absolute;margin:17px auto;height:6px;border-radius:3px;width:200px;margin-left:-100px;left:50%;background-color:#ddd}.g-resize-highlight[data-v-cd2d7ce2]{position:absolute;left:0;top:0;height:6px;background-color:#27ae60;border-radius:3px}.circle-btn[data-v-cd2d7ce2]{display:block;position:absolute;left:0;top:-5px;width:14px;height:14px;margin-left:-7px;background-color:#fff;border-radius:7px;box-shadow:0 2px 4px -2px rgba(0,0,0,.5),0 -2px 4px -2px rgba(0,0,0,.45);border-width:0}@media (max-width:480px){.g-resize-bar[data-v-cd2d7ce2]{width:120px;margin-left:auto;left:10px}}",""])},263:function(t,e,o){e=t.exports=o(7)(),e.push([t.i,'.image-mask[data-v-de206136]{position:absolute;left:0;top:0;width:100%;height:100%}.image-mask .mask[data-v-de206136]{position:absolute;background-color:hsla(0,0%,100%,.6)}.crop-box[data-v-de206136]{box-sizing:border-box;position:absolute;background:none;cursor:move;width:100px;height:100px;border:1px solid hsla(0,0%,100%,.95)}.crop-box[data-v-de206136]:after,.crop-box[data-v-de206136]:before{content:"";display:block;opacity:0;position:absolute;left:33.3333%;top:0;width:33.334%;height:100%;background-color:transparent;border:0 solid hsla(0,0%,100%,.7)}.crop-box[data-v-de206136]:active:after,.crop-box[data-v-de206136]:active:before{opacity:1}.crop-box[data-v-de206136]:before{border-left-width:1px;border-right-width:1px}.crop-box[data-v-de206136]:after{top:33.3333%;left:0;height:33.3334%;width:100%;border-top-width:1px;border-bottom-width:1px}.crop-box .g-resize[data-v-de206136]{display:inline-block;z-index:1910;position:absolute;bottom:-8px;right:-8px;width:16px;height:16px;cursor:se-resize;border-radius:10px;background-color:#fff;box-shadow:0 2px 4px -2px rgba(0,0,0,.25)}',""])},534:function(t,e,o){"use strict";var i=o(541),r=o.n(i);e.a=r.a},535:function(t,e,o){!function(e,o){t.exports=o()}(0,function(){return function(t){function e(i){if(o[i])return o[i].exports;var r=o[i]={i:i,l:!1,exports:{}};return t[i].call(r.exports,r,r.exports,e),r.l=!0,r.exports}var o={};return e.m=t,e.c=o,e.i=function(t){return t},e.d=function(t,o,i){e.o(t,o)||Object.defineProperty(t,o,{configurable:!1,enumerable:!0,get:i})},e.n=function(t){var o=t&&t.__esModule?function(){return t.default}:function(){return t};return e.d(o,"a",o),o},e.o=function(t,e){return Object.prototype.hasOwnProperty.call(t,e)},e.p="",e(e.s=20)}({20:function(t,e,o){"use strict";Object.defineProperty(e,"__esModule",{value:!0}),e.default={_getImageType:function(t){var e="image/jpeg",o=t.match(/(image\/[\w]+)\.*/)[0];return void 0!==o&&(e=o),e},compress:function(t,e,o){var i=new FileReader,r=this;i.onload=function(i){var n=new Image;n.src=i.target.result,n.onload=function(){var i=r._getImageType(t.type),a=r._getCanvas(n.naturalWidth,n.naturalHeight),s=(a.getContext("2d").drawImage(n,0,0),a.toDataURL(i,e/100));o(s)}},i.readAsDataURL(t)},crop:function(t,e,o){var i=function(t){return"number"==typeof t};if(i(e.toCropImgX)&&i(e.toCropImgY)&&e.toCropImgW>0&&e.toCropImgH>0){var r=e.toCropImgW,n=e.toCropImgH;e.maxWidth&&e.maxWidth<r&&(r=e.maxWidth,n=e.toCropImgH*r/e.toCropImgW),e.maxHeight&&e.maxHeight<n&&(n=e.maxHeight);var a=this._getCanvas(r,n),s=(a.getContext("2d").drawImage(t,e.toCropImgX,e.toCropImgY,e.toCropImgW,e.toCropImgH,0,0,r,n),this._getImageType(t.src));o(a.toDataURL(s,e.compress/100))}},resize:function(t,e,o){var i=function(t){return"number"==typeof t};if(i(e.toCropImgX)&&i(e.toCropImgY)&&e.toCropImgW>0&&e.toCropImgH>0){var r=e.toCropImgW*e.imgChangeRatio,n=e.toCropImgH*e.imgChangeRatio,a=this._getCanvas(r,n),s=(a.getContext("2d").drawImage(t,0,0,e.toCropImgW,e.toCropImgH,0,0,r,n),this._getImageType(t.src));o(a.toDataURL(s,e.compress/100))}},_loadImage:function(t,e){var o=new Image;o.src=t,o.onload=function(){e(o)},o.onerror=function(){console.log("Error: image error!")}},_getCanvas:function(t,e){var o=document.createElement("canvas");return o.width=t,o.height=e,o}}}})})},536:function(t,e,o){!function(e,o){t.exports=o()}(0,function(){return function(t){function e(i){if(o[i])return o[i].exports;var r=o[i]={i:i,l:!1,exports:{}};return t[i].call(r.exports,r,r.exports,e),r.l=!0,r.exports}var o={};return e.m=t,e.c=o,e.i=function(t){return t},e.d=function(t,o,i){e.o(t,o)||Object.defineProperty(t,o,{configurable:!1,enumerable:!0,get:i})},e.n=function(t){var o=t&&t.__esModule?function(){return t.default}:function(){return t};return e.d(o,"a",o),o},e.o=function(t,e){return Object.prototype.hasOwnProperty.call(t,e)},e.p="",e(e.s=21)}({0:function(t,e,o){"use strict";t.exports={isMobile:/Android|webOS|iPhone|iPad|iPod|BlackBerry|IEMobile|Opera Mini/i.test(navigator.userAgent),setCssText:function(t){var e=[];for(var o in t){var i=t[o];"number"==typeof i&&(i+="px"),e.push(o+": "+i+";")}return e.join("")}}},21:function(t,e,o){"use strict";function i(t,e,o,i,r){if(e){var n=document.body.offsetHeight,c=1/r,u=parseInt(window.getComputedStyle(o).width),l=parseInt(window.getComputedStyle(o).height),p=document.querySelector(".info-aside"),d=(s-u)/2,h=parseInt(window.getComputedStyle(p).height),f=(n-l-h)/2,g=a?t.changedTouches[0].clientX:t.clientX,m=a?t.changedTouches[0].clientY:t.clientY,A=parseInt(e.offsetWidth),v=parseInt(e.offsetHeight),x={};return r>=1&&g<=d+u?(A>=u&&(x.width=u),x.width=i.w+g-i.x,x.height=A*c,u>l?A>l&&(x.height=l,x.width=l*r):u<l?A>u&&(x.width=u,x.height=u*c):A>=u&&(x.width=u,x.height=u*c)):r<1&&m<f+l+h?(x.height=i.h+m-i.y,x.width=parseInt(e.style.height)*r,u>l?v>l&&(x.height=l,x.width=l*r):A>u&&(x.width=u,x.height=u*c)):"auto"==r&&m<=f+l+h&&g<=f+u?(x.height=i.h+m-i.y,x.width=i.w+g-i.x):g<=d+u&&(x.width=i.w+g-i.x,x.height=e.style.width,u>l?v>l&&(x.height=l,x.width=l):u<l?A>u&&(x.width=u,x.height=u):A>u&&(x.width=e.style.height=u)),x}}Object.defineProperty(e,"__esModule",{value:!0}),e.default=i;var r=o(0),n=function(t){return t&&t.__esModule?t:{default:t}}(r),a=n.default.isMobile,s=document.body.offsetWidth}})})},537:function(t,e,o){!function(e,o){t.exports=o()}(0,function(){return function(t){function e(i){if(o[i])return o[i].exports;var r=o[i]={i:i,l:!1,exports:{}};return t[i].call(r.exports,r,r.exports,e),r.l=!0,r.exports}var o={};return e.m=t,e.c=o,e.i=function(t){return t},e.d=function(t,o,i){e.o(t,o)||Object.defineProperty(t,o,{configurable:!1,enumerable:!0,get:i})},e.n=function(t){var o=t&&t.__esModule?function(){return t.default}:function(){return t};return e.d(o,"a",o),o},e.o=function(t,e){return Object.prototype.hasOwnProperty.call(t,e)},e.p="",e(e.s=22)}({22:function(t,e,o){"use strict";var i="function"==typeof Symbol&&"symbol"==typeof Symbol.iterator?function(t){return typeof t}:function(t){return t&&"function"==typeof Symbol&&t.constructor===Symbol&&t!==Symbol.prototype?"symbol":typeof t};void 0===XMLHttpRequest.prototype.sendAsBinary&&(XMLHttpRequest.prototype.sendAsBinary=function(t){var e=Array.prototype.map.call(t,function(t){return 255&t.charCodeAt(0)});this.send(new Uint8Array(e).buffer)}),t.exports=function(t,e,o,r,n,a,s){function c(t){for(var e={},o=/([a-z\-]+):\s?(.*);?/gi,i=void 0;i=o.exec(t);)e[i[1]]=i[2];return e}var u=new XMLHttpRequest,l=a||function(){console.error("AJAX ERROR!")},p="vuecodeimageupload",d=!1;"blob"===t&&(d=t,t="GET"),console.log(r),t=t.toUpperCase(),u.onload=function(){var e=u.response;try{e=JSON.parse(u.responseText)}catch(t){401===u.status&&(e=l("access_denied",u.statusText))}var o=c(u.getAllResponseHeaders());o.statusCode=u.status,n(e||("GET"===t?l("empty_response","Could not get resource"):{}),o)},u.onerror=function(){var t=u.responseText;try{t=JSON.parse(u.responseText)}catch(t){console.error(t)}n(t||l("access_denied","Could not get resource"))};var h=void 0;if("GET"===t||"DELETE"===t)r=null;else if(s){var f=r,g=r.base64Code.replace("data:"+r.type+";base64,","");r=["--"+p,'Content-Disposition: form-data; name="'+r.filed+'"; filename="'+r.filename+'"',"Content-Type: "+r.type,"",window.atob(g),""].join("\r\n");var m=Object.keys(f);if(m.length>4){var A=!0,v=!1,x=void 0;try{for(var C,b=m[Symbol.iterator]();!(A=(C=b.next()).done);A=!0){var y=C.value;-1==["filed","filename","type","base64Code"].indexOf(y)&&(r+=["--"+p,'Content-Disposition: form-data; name="'+y+'";',"",""].join("\r\n"),r+=["object"===i(f[y])?JSON.stringify(f[y]):f[y],""].join("\r\n"))}}catch(a){v=!0,x=a}finally{try{!A&&b.return&&b.return()}finally{if(v)throw x}}}r+="--"+p+"--"}if(u.open(t,e,!0),d&&("responseType"in u?u.responseType=d:u.overrideMimeType("text/plain; charset=x-user-defined")),o){for(h in o)u.setRequestHeader(h,o[h]);s&&u.setRequestHeader("Content-Type","multipart/form-data; boundary="+p)}return s?u.sendAsBinary(r):(u.withCredentials=!0,u.send(r),u)}}})})},538:function(t,e,o){"use strict";Object.defineProperty(e,"__esModule",{value:!0}),e.default={url:{type:String},text:{type:String,default:"Upload Image"},extensions:{type:String,default:"png.jpg,jpeg,gif,svg,webp"},inputOfFile:{type:String,default:"files"},crop:{type:[String,Boolean],default:""},cropBtn:{type:Object,default:function(){return{ok:"Ok",cancel:"Cancel"}}},cropRatio:{type:String,default:"1:1"},resize:{type:[String,Boolean],default:!1},ResizeBtn:{type:Object,default:function(){return{ok:"Ok",cancel:"Cancel"}}},maxFileSize:{type:Number,default:104857600},maxWidth:{type:Number},maxHeight:{type:Number},inputAccept:{type:String,default:"image/jpg,image/jpeg,image/png"},isXhr:{type:Boolean,default:!0},headers:{type:Object,default:function(){return{}}},data:{type:Object,default:function(){return{}}},multiple:{type:Boolean,default:!1},multipleSize:{type:Number,default:0},minWidth:{type:Number,default:50},compress:{type:[Number,String],default:0}}},539:function(t,e,o){o(584);var i=o(27)(o(142),o(565),"data-v-de206136",null);t.exports=i.exports},540:function(t,e,o){o(582);var i=o(27)(o(143),o(562),"data-v-cd2d7ce2",null);t.exports=i.exports},541:function(t,e,o){o(574);var i=o(27)(o(144),o(553),null,null);t.exports=i.exports},551:function(t,e){t.exports={render:function(){var t=this,e=t.$createElement,o=t._self._c||e;return o("div",[o("div",{staticClass:"crumbs"},[o("el-breadcrumb",{attrs:{separator:"/"}},[o("el-breadcrumb-item",[o("i",{staticClass:"el-icon-date"}),t._v(" 表单")]),t._v(" "),o("el-breadcrumb-item",[t._v("图片上传")])],1)],1),t._v(" "),o("div",{staticClass:"content-title"},[t._v("支持拖拽")]),t._v(" "),t._m(0),t._v(" "),o("el-upload",{attrs:{action:"/api/posts/",type:"drag","thumbnail-mode":!0,"on-preview":t.handlePreview,"on-remove":t.handleRemove,"on-error":t.handleError,"default-file-list":t.fileList}},[o("i",{staticClass:"el-icon-upload"}),t._v(" "),o("div",{staticClass:"el-dragger__text"},[t._v("将文件拖到此处，或"),o("em",[t._v("点击上传")])]),t._v(" "),o("div",{staticClass:"el-upload__tip",slot:"tip"},[t._v("只能上传jpg/png文件，且不超过500kb")])]),t._v(" "),o("div",{staticClass:"content-title"},[t._v("支持裁剪")]),t._v(" "),t._m(1),t._v(" "),o("img",{staticClass:"pre-img",attrs:{src:t.src,alt:""}}),t._v(" "),o("vue-core-image-upload",{class:["pure-button","pure-button-primary","js-btn-crop"],attrs:{crop:!0,text:"上传图片",url:"/api/posts/",extensions:"png,gif,jpeg,jpg"},on:{":imageuploaded":t.imageuploaded,":errorhandle":t.handleError}})],1)},staticRenderFns:[function(){var t=this,e=t.$createElement,o=t._self._c||e;return o("div",{staticClass:"plugins-tips"},[t._v("\n        Element UI自带上传组件。\n        访问地址："),o("a",{attrs:{href:"http://element.eleme.io/#/zh-CN/component/upload",target:"_blank"}},[t._v("Element UI Upload")])])},function(){var t=this,e=t.$createElement,o=t._self._c||e;return o("div",{staticClass:"plugins-tips"},[t._v("\n        Vue-Core-Image-Upload：一款轻量级的vue上传插件，支持裁剪。\n        访问地址："),o("a",{attrs:{href:"https://github.com/Vanthink-UED/vue-core-image-upload",target:"_blank"}},[t._v("Vue-Core-Image-Upload")])])}]}},553:function(t,e){t.exports={render:function(){var t=this,e=t.$createElement,o=t._self._c||e;return o("div",{staticClass:"g-core-image-upload-btn"},[t._t("default",[t._v(t._s(t.text))]),t._v(" "),o("form",{directives:[{name:"show",rawName:"v-show",value:!t.hasImage,expression:"!hasImage"}],staticClass:"g-core-image-upload-form",staticStyle:{display:"block",cursor:"pointer",position:"absolute",left:"0px",top:"0px",width:"1242px",height:"61px",opacity:"0",margin:"0px",padding:"0px",overflow:"hidden"},attrs:{method:"post",enctype:"multipart/form-data",action:"/api2/common_user/cropHeadUrl"}},[o("input",{staticStyle:{width:"100%",height:"100%"},attrs:{disabled:t.uploading,id:"g-core-upload-input-"+t.formID,name:t.name,multiple:t.multiple,type:"file",accept:t.inputAccept},on:{change:t.change}})]),t._v(" "),o("div",{directives:[{name:"show",rawName:"v-show",value:t.hasImage,expression:"hasImage"}],staticClass:"g-core-image-corp-container",attrs:{id:"vciu-modal-"+t.formID}},[o("div",{staticClass:"image-aside"},[o("div",{staticClass:"g-crop-image-box"},[o("crop",{ref:"cropBox",attrs:{"form-id":t.formID,"hide-crop":t.resize,ratio:t.cropRatio}})],1)]),t._v(" "),o("div",{staticClass:"info-aside"},[t.resize?o("resize-bar",{ref:"resizeBar",attrs:{"min-progress":t.image.minProgress},on:{resize:t.resizeImage}}):t._e(),t._v(" "),t.crop?o("p",{staticClass:"btn-groups"},[o("button",{staticClass:"btn btn-upload",attrs:{type:"button"},on:{click:t.doCrop}},[t._v(t._s(t.cropBtn.ok))]),t._v(" "),o("button",{staticClass:"btn btn-cancel",attrs:{type:"button"},on:{click:t.cancel}},[t._v(t._s(t.cropBtn.cancel))])]):t._e(),t._v(" "),t.resize?o("p",{staticClass:"btn-groups"},[o("button",{staticClass:"btn btn-upload",attrs:{type:"button"},on:{click:t.doResize}},[t._v(t._s(t.ResizeBtn.ok))]),t._v(" "),o("button",{staticClass:"btn btn-cancel",attrs:{type:"button"},on:{click:t.cancel}},[t._v(t._s(t.ResizeBtn.cancel))])]):t._e()],1)])],2)},staticRenderFns:[]}},562:function(t,e){t.exports={render:function(){var t=this,e=t.$createElement,o=t._self._c||e;return o("div",{staticClass:"g-resize-bar"},[o("div",{staticClass:"g-resize-highlight",style:{width:t.left+"%"}}),t._v(" "),o("button",{staticClass:"circle-btn",style:{left:t.left+"%"},on:{touchstart:function(e){if(e.target!==e.currentTarget)return null;t.drag(e)},mousedown:function(e){if(e.target!==e.currentTarget)return null;t.drag(e)}}})])},staticRenderFns:[]}},565:function(t,e){t.exports={render:function(){var t=this,e=t.$createElement,o=t._self._c||e;return o("div",{staticClass:"g-crop-image-principal"},[o("div",{staticClass:"image-wrap",style:{width:t.width+"px",height:t.height+"px"}},[o("img",{ref:"crop-image",style:{width:"100%",height:"100%"},attrs:{src:t.src}})]),t._v(" "),t.hideCrop?t._e():o("div",{staticClass:"image-mask"},[o("div",{staticClass:"mask top",style:{top:0,height:t.cropCSS.top+"px",left:0,width:"100%"}}),t._v(" "),o("div",{staticClass:"mask bottom",style:{bottom:0,top:t.cropCSS.top+t.cropCSS.height+"px",left:0,width:"100%"}}),t._v(" "),o("div",{staticClass:"mask left",style:{top:t.cropCSS.top+"px",height:t.cropCSS.height+"px",left:0,width:t.cropCSS.left+"px"}}),t._v(" "),o("div",{staticClass:"mask right",style:{top:t.cropCSS.top+"px",height:t.cropCSS.height+"px",left:t.cropCSS.left+t.cropCSS.width+"px",right:0}})]),t._v(" "),t.hideCrop?t._e():o("div",{staticClass:"crop-box",style:{top:t.cropCSS.top+"px",left:t.cropCSS.left+"px",height:t.cropCSS.height+"px",width:t.cropCSS.width+"px"},on:{touchstart:function(e){if(e.target!==e.currentTarget)return null;t.drag(e)},mousedown:function(e){if(e.target!==e.currentTarget)return null;t.drag(e)}}},[o("div",{staticClass:"reference-line v"}),t._v(" "),o("div",{staticClass:"reference-line h"}),t._v(" "),o("a",{staticClass:"g-resize",on:{touchstart:function(e){if(e.target!==e.currentTarget)return null;t.resize(e)},mousedown:function(e){if(e.target!==e.currentTarget)return null;t.resize(e)}}})])])},staticRenderFns:[]}},573:function(t,e,o){var i=o(252);"string"==typeof i&&(i=[[t.i,i,""]]),i.locals&&(t.exports=i.locals);o(26)("08a91ef3",i,!0)},574:function(t,e,o){var i=o(253);"string"==typeof i&&(i=[[t.i,i,""]]),i.locals&&(t.exports=i.locals);o(26)("52eaf15a",i,!0)},582:function(t,e,o){var i=o(261);"string"==typeof i&&(i=[[t.i,i,""]]),i.locals&&(t.exports=i.locals);o(26)("34f0ec8c",i,!0)},584:function(t,e,o){var i=o(263);"string"==typeof i&&(i=[[t.i,i,""]]),i.locals&&(t.exports=i.locals);o(26)("6a5d0fb3",i,!0)},87:function(t,e,o){o(573);var i=o(27)(o(157),o(551),"data-v-28010e39",null);t.exports=i.exports}});
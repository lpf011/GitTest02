<h2> ${name}</h2><br>

<#--升序-->
<#list arr1?sort as ele>
    ${ele}  ${ele?index}<br>
</#list>
<hr>
<#--倒叙-->
<#list arr1?reverse as ele>
    ${ele}  ${ele?index}<br>
</#list>
<hr>
<#list hash?keys as key>
    ${key} -----> ${hash[key]}
</#list>
<hr>
<#assign num=12>
${num}
<#assign numbers=[12,"花开花落",13]>
${numbers?join("-")}
${numbers?join(",")}
<hr>
<#if numbers?? >
    ${numbers?join(",")}
<#else>没有匹配的选项
</#if>
<hr>
<#macro g>
    京ICP备11041704号 | ICP | 互联网药品信息服务资格证编号(京)-经
    公司：<#nested >
    地址：<#nested >
</#macro>
<@g>
    京东
</@g>


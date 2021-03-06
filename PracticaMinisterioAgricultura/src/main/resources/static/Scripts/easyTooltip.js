! function(t) {
  t.fn.easyTooltip = function(o) {
    function e(t) {
      if ("relative" == o.tooltipPosition) switch (o.tooltipDir) {
        case "top":
          i.css("top", p.offset().top - i.innerHeight() - o.yOffset - o.tooltipArwBorderWidth + "px").css("left", p.offset().left + (p.innerWidth() - i.innerWidth()) / 2 + "px"), r.css({
            left: "50%",
            "margin-left": -o.tooltipArwBorderWidth + "px",
            bottom: 2 * -o.tooltipArwBorderWidth + "px",
            "border-top-color": o.tooltipBgColor
          });
          break;
        case "bottom":
          i.css("top", p.offset().top + p.innerHeight() + o.tooltipArwBorderWidth + o.yOffset + "px").css("left", p.offset().left + (p.innerWidth() - i.innerWidth()) / 2 + "px"), r.css({
            left: "50%",
            "margin-left": -o.tooltipArwBorderWidth + "px",
            top: 2 * -o.tooltipArwBorderWidth + "px",
            "border-bottom-color": o.tooltipBgColor
          });
          break;
        case "left":
          i.css("top", p.offset().top + (p.innerHeight() - i.innerHeight()) / 2 + "px").css("left", p.offset().left - i.innerWidth() - o.tooltipArwBorderWidth - o.xOffset + "px"), r.css({
            top: "50%",
            "margin-top": -o.tooltipArwBorderWidth + "px",
            right: 2 * -o.tooltipArwBorderWidth + "px",
            "border-left-color": o.tooltipBgColor
          });
          break;
        case "right":
          i.css("top", p.offset().top + (p.innerHeight() - i.innerHeight()) / 2 + "px").css("left", p.offset().left + p.innerWidth() + o.tooltipArwBorderWidth + o.xOffset + "px"), r.css({
            top: "50%",
            "margin-top": -o.tooltipArwBorderWidth + "px",
            left: 2 * -o.tooltipArwBorderWidth + "px",
            "border-right-color": o.tooltipBgColor
          });
          break;
        default:
          i.css("top", p.offset().top - i.innerHeight() - o.yOffset + "px").css("left", p.offset().left + (p.innerWidth() - i.innerWidth()) / 2 + "px"), r.css({
            left: "50%",
            "margin-left": -o.tooltipArwBorderWidth + "px",
            bottom: 2 * -o.tooltipArwBorderWidth + "px",
            "border-top-color": o.tooltipBgColor
          })
      } else switch (r.hide(), o.tooltipDir) {
        case "top":
          i.css("top", t.pageY - i.innerHeight() - o.yOffset + "px").css("left", t.pageX - i.innerWidth() / 2 + "px");
          break;
        case "bottom":
          i.css("top", t.pageY + o.yOffset + "px").css("left", t.pageX - i.innerWidth() / 2 + "px");
          break;
        case "left":
          i.css("top", t.pageY - i.innerHeight() / 2 + "px").css("left", t.pageX - i.innerWidth() - o.xOffset + "px");
          break;
        case "right":
          i.css("top", t.pageY - i.innerHeight() / 2 + "px").css("left", t.pageX + o.xOffset + "px");
          break;
        default:
          i.css("top", t.pageY - i.innerHeight() - o.yOffset + "px").css("left", t.pageX - i.innerWidth() / 2 + "px")
      }
    }
    var i, r, o = t.extend({
        tooltipId: "easyTooltip",
        tooltipClass: "easyTooltip",
        content: "",
        existedContentId: "",
        tooltipDir: "top",
        xOffset: 5,
        yOffset: 5,
        clickRemove: !1,
        tooltipPosition: "absolute",
        defaultRadius: "3px",
        tooltipZindex: 1e4,
        tooltipPadding: "10px 15px",
        tooltipBgColor: "rgba(200,200,200,0.7)",
        tooltipFtSize: "20px",
        tooltipLineHeight: "24px",
        tooltipFtColor: "#000",
        tooltipOpacity: 1,
        tooltipArwBorderWidth: 6
      }, o),
      p = t(this),
      s = "" != o.existedContentId ? t("#" + o.existedContentId).html() : "" != o.content ? o.content : title;
    this.each(function() {
      var p = t(this).attr("title");
      t(this).hover(function(p) {
        t(this).attr("title", ""), "" != s && void 0 != s && (t("body").append("<div id='" + o.tooltipId + "' class='" + o.tooltipClass + "'>" + s + "<span class='arw'></span></div>"), i = t("#" + o.tooltipId), r = t("#" + o.tooltipId + " .arw"), i.css({
          position: "absolute",
          "z-index": o.tooltipZindex,
          display: "none",
          padding: o.tooltipPadding,
          "background-color": o.tooltipBgColor,
          "font-size": o.tooltipFtSize,
          "line-height": o.tooltipLineHeight,
          color: o.tooltipFtColor,
          opacity: o.tooltipOpacity,
          "border-radius": o.defaultRadius
        }).fadeIn("fast"), r.css({
          display: "inline-block",
          position: "absolute",
          width: "0",
          height: "0",
          "border-style": "solid",
          "border-width": o.tooltipArwBorderWidth + "px",
          "border-color": "transparent"
        }), e(p))
      }, function() {
        i.remove(), t(this).attr("title", p)
      }), t(this).mousemove(function(t) {
        "relative" != o.tooltipPosition && e(t)
      }), o.clickRemove && t(this).mousedown(function(o) {
        i.remove(), t(this).attr("title", p)
      })
    })
  }
}(jQuery);

package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class UiLegend extends JsObject {

    private String jsBase;

    public UiLegend() {

    }

    protected UiLegend(String jsBase) {
        this.jsBase = jsBase;
    }

    
    private EnumsAlign align;
    private String align1;

    public void setAlign(EnumsAlign align) {
        if (jsBase == null) {
            this.align = null;
            this.align1 = null;
            
            this.align = align;
        } else {
            this.align = align;

            js.append(String.format(Locale.US, jsBase + ".align(%s);", (align != null) ? align.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".align(%s);", (align != null) ? align.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setAlign(String align1) {
        if (jsBase == null) {
            this.align = null;
            this.align1 = null;
            
            this.align1 = align1;
        } else {
            this.align1 = align1;

            js.append(String.format(Locale.US, jsBase + ".align(%s);", align1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".align(%s);", align1));
                js.setLength(0);
            }
        }
    }

    private UiBackground getbackground;

    public UiBackground getBackground() {
        if (getbackground == null)
            getbackground = new UiBackground(jsBase + ".background()");

        return getbackground;
    }

    private String background;
    private String background1;
    private Boolean background2;

    public void setBackground(String background) {
        if (jsBase == null) {
            this.background = null;
            this.background1 = null;
            this.background2 = null;
            
            this.background = background;
        } else {
            this.background = background;

            js.append(String.format(Locale.US, jsBase + ".background(%s);", background));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".background(%s);", background));
                js.setLength(0);
            }
        }
    }


    public void setBackground(Boolean background2) {
        if (jsBase == null) {
            this.background = null;
            this.background1 = null;
            this.background2 = null;
            
            this.background2 = background2;
        } else {
            this.background2 = background2;

            js.append(String.format(Locale.US, jsBase + ".background(%b);", background2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".background(%b);", background2));
                js.setLength(0);
            }
        }
    }

    private Boolean disablePointerEvents;

    public void setDisablepointerevents(Boolean disablePointerEvents) {
        if (jsBase == null) {
            this.disablePointerEvents = disablePointerEvents;
        } else {
            this.disablePointerEvents = disablePointerEvents;

            js.append(String.format(Locale.US, jsBase + ".disablePointerEvents(%b);", disablePointerEvents));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".disablePointerEvents(%b);", disablePointerEvents));
                js.setLength(0);
            }
        }
    }

    private Boolean drag;

    public void setDrag(Boolean drag) {
        if (jsBase == null) {
            this.drag = drag;
        } else {
            this.drag = drag;

            js.append(String.format(Locale.US, jsBase + ".drag(%b);", drag));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".drag(%b);", drag));
                js.setLength(0);
            }
        }
    }

    private Boolean enabled;

    public void setEnabled(Boolean enabled) {
        if (jsBase == null) {
            this.enabled = enabled;
        } else {
            this.enabled = enabled;

            js.append(String.format(Locale.US, jsBase + ".enabled(%b);", enabled));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".enabled(%b);", enabled));
                js.setLength(0);
            }
        }
    }

    private String fontColor;

    public void setFontcolor(String fontColor) {
        if (jsBase == null) {
            this.fontColor = fontColor;
        } else {
            this.fontColor = fontColor;

            js.append(String.format(Locale.US, jsBase + ".fontColor(%s);", fontColor));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontColor(%s);", fontColor));
                js.setLength(0);
            }
        }
    }

    private Decoration fontDecoration;
    private String fontDecoration1;

    public void setFontdecoration(Decoration fontDecoration) {
        if (jsBase == null) {
            this.fontDecoration = null;
            this.fontDecoration1 = null;
            
            this.fontDecoration = fontDecoration;
        } else {
            this.fontDecoration = fontDecoration;

            js.append(String.format(Locale.US, jsBase + ".fontDecoration(%s);", (fontDecoration != null) ? fontDecoration.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontDecoration(%s);", (fontDecoration != null) ? fontDecoration.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setFontdecoration(String fontDecoration1) {
        if (jsBase == null) {
            this.fontDecoration = null;
            this.fontDecoration1 = null;
            
            this.fontDecoration1 = fontDecoration1;
        } else {
            this.fontDecoration1 = fontDecoration1;

            js.append(String.format(Locale.US, jsBase + ".fontDecoration(%s);", fontDecoration1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontDecoration(%s);", fontDecoration1));
                js.setLength(0);
            }
        }
    }

    private String fontFamily;

    public void setFontfamily(String fontFamily) {
        if (jsBase == null) {
            this.fontFamily = fontFamily;
        } else {
            this.fontFamily = fontFamily;

            js.append(String.format(Locale.US, jsBase + ".fontFamily(%s);", fontFamily));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontFamily(%s);", fontFamily));
                js.setLength(0);
            }
        }
    }

    private Double fontOpacity;

    public void setFontopacity(Double fontOpacity) {
        if (jsBase == null) {
            this.fontOpacity = fontOpacity;
        } else {
            this.fontOpacity = fontOpacity;

            js.append(String.format(Locale.US, jsBase + ".fontOpacity(%f);", fontOpacity));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontOpacity(%f);", fontOpacity));
                js.setLength(0);
            }
        }
    }

    private String fontSize;
    private Double fontSize1;

    public void setFontsize(String fontSize) {
        if (jsBase == null) {
            this.fontSize = null;
            this.fontSize1 = null;
            
            this.fontSize = fontSize;
        } else {
            this.fontSize = fontSize;

            js.append(String.format(Locale.US, jsBase + ".fontSize(%s);", fontSize));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontSize(%s);", fontSize));
                js.setLength(0);
            }
        }
    }


    public void setFontsize(Double fontSize1) {
        if (jsBase == null) {
            this.fontSize = null;
            this.fontSize1 = null;
            
            this.fontSize1 = fontSize1;
        } else {
            this.fontSize1 = fontSize1;

            js.append(String.format(Locale.US, jsBase + ".fontSize(%f);", fontSize1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontSize(%f);", fontSize1));
                js.setLength(0);
            }
        }
    }

    private TextFontStyle fontStyle;
    private String fontStyle1;

    public void setFontstyle(TextFontStyle fontStyle) {
        if (jsBase == null) {
            this.fontStyle = null;
            this.fontStyle1 = null;
            
            this.fontStyle = fontStyle;
        } else {
            this.fontStyle = fontStyle;

            js.append(String.format(Locale.US, jsBase + ".fontStyle(%s);", (fontStyle != null) ? fontStyle.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontStyle(%s);", (fontStyle != null) ? fontStyle.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setFontstyle(String fontStyle1) {
        if (jsBase == null) {
            this.fontStyle = null;
            this.fontStyle1 = null;
            
            this.fontStyle1 = fontStyle1;
        } else {
            this.fontStyle1 = fontStyle1;

            js.append(String.format(Locale.US, jsBase + ".fontStyle(%s);", fontStyle1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontStyle(%s);", fontStyle1));
                js.setLength(0);
            }
        }
    }

    private TextFontVariant fontVariant;
    private String fontVariant1;

    public void setFontvariant(TextFontVariant fontVariant) {
        if (jsBase == null) {
            this.fontVariant = null;
            this.fontVariant1 = null;
            
            this.fontVariant = fontVariant;
        } else {
            this.fontVariant = fontVariant;

            js.append(String.format(Locale.US, jsBase + ".fontVariant(%s);", (fontVariant != null) ? fontVariant.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontVariant(%s);", (fontVariant != null) ? fontVariant.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setFontvariant(String fontVariant1) {
        if (jsBase == null) {
            this.fontVariant = null;
            this.fontVariant1 = null;
            
            this.fontVariant1 = fontVariant1;
        } else {
            this.fontVariant1 = fontVariant1;

            js.append(String.format(Locale.US, jsBase + ".fontVariant(%s);", fontVariant1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontVariant(%s);", fontVariant1));
                js.setLength(0);
            }
        }
    }

    private String fontWeight;
    private Double fontWeight1;

    public void setFontweight(String fontWeight) {
        if (jsBase == null) {
            this.fontWeight = null;
            this.fontWeight1 = null;
            
            this.fontWeight = fontWeight;
        } else {
            this.fontWeight = fontWeight;

            js.append(String.format(Locale.US, jsBase + ".fontWeight(%s);", fontWeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontWeight(%s);", fontWeight));
                js.setLength(0);
            }
        }
    }


    public void setFontweight(Double fontWeight1) {
        if (jsBase == null) {
            this.fontWeight = null;
            this.fontWeight1 = null;
            
            this.fontWeight1 = fontWeight1;
        } else {
            this.fontWeight1 = fontWeight1;

            js.append(String.format(Locale.US, jsBase + ".fontWeight(%f);", fontWeight1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontWeight(%f);", fontWeight1));
                js.setLength(0);
            }
        }
    }

    private AnychartMathRect getgetRemainingBounds;

    public AnychartMathRect getGetremainingbounds() {
        if (getgetRemainingBounds == null)
            getgetRemainingBounds = new AnychartMathRect(jsBase + ".getRemainingBounds()");

        return getgetRemainingBounds;
    }

    private TextHAlign hAlign;
    private String hAlign1;

    public void setHalign(TextHAlign hAlign) {
        if (jsBase == null) {
            this.hAlign = null;
            this.hAlign1 = null;
            
            this.hAlign = hAlign;
        } else {
            this.hAlign = hAlign;

            js.append(String.format(Locale.US, jsBase + ".hAlign(%s);", (hAlign != null) ? hAlign.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hAlign(%s);", (hAlign != null) ? hAlign.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setHalign(String hAlign1) {
        if (jsBase == null) {
            this.hAlign = null;
            this.hAlign1 = null;
            
            this.hAlign1 = hAlign1;
        } else {
            this.hAlign1 = hAlign1;

            js.append(String.format(Locale.US, jsBase + ".hAlign(%s);", hAlign1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hAlign(%s);", hAlign1));
                js.setLength(0);
            }
        }
    }

    private Double height;
    private String height1;

    public void setHeight(Double height) {
        if (jsBase == null) {
            this.height = null;
            this.height1 = null;
            
            this.height = height;
        } else {
            this.height = height;

            js.append(String.format(Locale.US, jsBase + ".height(%f);", height));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".height(%f);", height));
                js.setLength(0);
            }
        }
    }


    public void setHeight(String height1) {
        if (jsBase == null) {
            this.height = null;
            this.height1 = null;
            
            this.height1 = height1;
        } else {
            this.height1 = height1;

            js.append(String.format(Locale.US, jsBase + ".height(%s);", height1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".height(%s);", height1));
                js.setLength(0);
            }
        }
    }

    private EnumsCursor hoverCursor;
    private String hoverCursor1;

    public void setHovercursor(EnumsCursor hoverCursor) {
        if (jsBase == null) {
            this.hoverCursor = null;
            this.hoverCursor1 = null;
            
            this.hoverCursor = hoverCursor;
        } else {
            this.hoverCursor = hoverCursor;

            js.append(String.format(Locale.US, jsBase + ".hoverCursor(%s);", (hoverCursor != null) ? hoverCursor.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverCursor(%s);", (hoverCursor != null) ? hoverCursor.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setHovercursor(String hoverCursor1) {
        if (jsBase == null) {
            this.hoverCursor = null;
            this.hoverCursor1 = null;
            
            this.hoverCursor1 = hoverCursor1;
        } else {
            this.hoverCursor1 = hoverCursor1;

            js.append(String.format(Locale.US, jsBase + ".hoverCursor(%s);", hoverCursor1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverCursor(%s);", hoverCursor1));
                js.setLength(0);
            }
        }
    }

    private Double iconSize;
    private String iconSize1;

    public void setIconsize(Double iconSize) {
        if (jsBase == null) {
            this.iconSize = null;
            this.iconSize1 = null;
            
            this.iconSize = iconSize;
        } else {
            this.iconSize = iconSize;

            js.append(String.format(Locale.US, jsBase + ".iconSize(%f);", iconSize));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconSize(%f);", iconSize));
                js.setLength(0);
            }
        }
    }


    public void setIconsize(String iconSize1) {
        if (jsBase == null) {
            this.iconSize = null;
            this.iconSize1 = null;
            
            this.iconSize1 = iconSize1;
        } else {
            this.iconSize1 = iconSize1;

            js.append(String.format(Locale.US, jsBase + ".iconSize(%s);", iconSize1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconSize(%s);", iconSize1));
                js.setLength(0);
            }
        }
    }

    private String iconTextSpacing;
    private Double iconTextSpacing1;

    public void setIcontextspacing(String iconTextSpacing) {
        if (jsBase == null) {
            this.iconTextSpacing = null;
            this.iconTextSpacing1 = null;
            
            this.iconTextSpacing = iconTextSpacing;
        } else {
            this.iconTextSpacing = iconTextSpacing;

            js.append(String.format(Locale.US, jsBase + ".iconTextSpacing(%s);", iconTextSpacing));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconTextSpacing(%s);", iconTextSpacing));
                js.setLength(0);
            }
        }
    }


    public void setIcontextspacing(Double iconTextSpacing1) {
        if (jsBase == null) {
            this.iconTextSpacing = null;
            this.iconTextSpacing1 = null;
            
            this.iconTextSpacing1 = iconTextSpacing1;
        } else {
            this.iconTextSpacing1 = iconTextSpacing1;

            js.append(String.format(Locale.US, jsBase + ".iconTextSpacing(%f);", iconTextSpacing1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".iconTextSpacing(%f);", iconTextSpacing1));
                js.setLength(0);
            }
        }
    }

    private Boolean inverted;

    public void setInverted(Boolean inverted) {
        if (jsBase == null) {
            this.inverted = inverted;
        } else {
            this.inverted = inverted;

            js.append(String.format(Locale.US, jsBase + ".inverted(%b);", inverted));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".inverted(%b);", inverted));
                js.setLength(0);
            }
        }
    }

    private LegendItemProvider[] items;

    public void setItems(LegendItemProvider[] items) {
        if (jsBase == null) {
            this.items = items;
        } else {
            this.items = items;

            js.append(String.format(Locale.US, jsBase + ".items(%s);", arrayToString(items)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".items(%s);", arrayToString(items)));
                js.setLength(0);
            }
        }
    }

    private String itemsLayout;
    private LegendLayout itemsLayout1;

    public void setItemslayout(String itemsLayout) {
        if (jsBase == null) {
            this.itemsLayout = null;
            this.itemsLayout1 = null;
            
            this.itemsLayout = itemsLayout;
        } else {
            this.itemsLayout = itemsLayout;

            js.append(String.format(Locale.US, jsBase + ".itemsLayout(%s);", itemsLayout));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".itemsLayout(%s);", itemsLayout));
                js.setLength(0);
            }
        }
    }


    public void setItemslayout(LegendLayout itemsLayout1) {
        if (jsBase == null) {
            this.itemsLayout = null;
            this.itemsLayout1 = null;
            
            this.itemsLayout1 = itemsLayout1;
        } else {
            this.itemsLayout1 = itemsLayout1;

            js.append(String.format(Locale.US, jsBase + ".itemsLayout(%s);", (itemsLayout1 != null) ? itemsLayout1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".itemsLayout(%s);", (itemsLayout1 != null) ? itemsLayout1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private String itemsSourceMode;
    private LegendItemsSourceMode itemsSourceMode1;

    public void setItemssourcemode(String itemsSourceMode) {
        if (jsBase == null) {
            this.itemsSourceMode = null;
            this.itemsSourceMode1 = null;
            
            this.itemsSourceMode = itemsSourceMode;
        } else {
            this.itemsSourceMode = itemsSourceMode;

            js.append(String.format(Locale.US, jsBase + ".itemsSourceMode(%s);", itemsSourceMode));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".itemsSourceMode(%s);", itemsSourceMode));
                js.setLength(0);
            }
        }
    }


    public void setItemssourcemode(LegendItemsSourceMode itemsSourceMode1) {
        if (jsBase == null) {
            this.itemsSourceMode = null;
            this.itemsSourceMode1 = null;
            
            this.itemsSourceMode1 = itemsSourceMode1;
        } else {
            this.itemsSourceMode1 = itemsSourceMode1;

            js.append(String.format(Locale.US, jsBase + ".itemsSourceMode(%s);", (itemsSourceMode1 != null) ? itemsSourceMode1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".itemsSourceMode(%s);", (itemsSourceMode1 != null) ? itemsSourceMode1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private String itemsSpacing;
    private Double itemsSpacing1;

    public void setItemsspacing(String itemsSpacing) {
        if (jsBase == null) {
            this.itemsSpacing = null;
            this.itemsSpacing1 = null;
            
            this.itemsSpacing = itemsSpacing;
        } else {
            this.itemsSpacing = itemsSpacing;

            js.append(String.format(Locale.US, jsBase + ".itemsSpacing(%s);", itemsSpacing));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".itemsSpacing(%s);", itemsSpacing));
                js.setLength(0);
            }
        }
    }


    public void setItemsspacing(Double itemsSpacing1) {
        if (jsBase == null) {
            this.itemsSpacing = null;
            this.itemsSpacing1 = null;
            
            this.itemsSpacing1 = itemsSpacing1;
        } else {
            this.itemsSpacing1 = itemsSpacing1;

            js.append(String.format(Locale.US, jsBase + ".itemsSpacing(%f);", itemsSpacing1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".itemsSpacing(%f);", itemsSpacing1));
                js.setLength(0);
            }
        }
    }

    private String letterSpacing;
    private Double letterSpacing1;

    public void setLetterspacing(String letterSpacing) {
        if (jsBase == null) {
            this.letterSpacing = null;
            this.letterSpacing1 = null;
            
            this.letterSpacing = letterSpacing;
        } else {
            this.letterSpacing = letterSpacing;

            js.append(String.format(Locale.US, jsBase + ".letterSpacing(%s);", letterSpacing));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".letterSpacing(%s);", letterSpacing));
                js.setLength(0);
            }
        }
    }


    public void setLetterspacing(Double letterSpacing1) {
        if (jsBase == null) {
            this.letterSpacing = null;
            this.letterSpacing1 = null;
            
            this.letterSpacing1 = letterSpacing1;
        } else {
            this.letterSpacing1 = letterSpacing1;

            js.append(String.format(Locale.US, jsBase + ".letterSpacing(%f);", letterSpacing1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".letterSpacing(%f);", letterSpacing1));
                js.setLength(0);
            }
        }
    }

    private String lineHeight;
    private Double lineHeight1;

    public void setLineheight(String lineHeight) {
        if (jsBase == null) {
            this.lineHeight = null;
            this.lineHeight1 = null;
            
            this.lineHeight = lineHeight;
        } else {
            this.lineHeight = lineHeight;

            js.append(String.format(Locale.US, jsBase + ".lineHeight(%s);", lineHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".lineHeight(%s);", lineHeight));
                js.setLength(0);
            }
        }
    }


    public void setLineheight(Double lineHeight1) {
        if (jsBase == null) {
            this.lineHeight = null;
            this.lineHeight1 = null;
            
            this.lineHeight1 = lineHeight1;
        } else {
            this.lineHeight1 = lineHeight1;

            js.append(String.format(Locale.US, jsBase + ".lineHeight(%f);", lineHeight1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".lineHeight(%f);", lineHeight1));
                js.setLength(0);
            }
        }
    }

    private String type;
    private Boolean useCapture;
    private String listenerScope;

    public void setListen(String type, Boolean useCapture, String listenerScope) {
        if (jsBase == null) {
            this.type = type;
            this.useCapture = useCapture;
            this.listenerScope = listenerScope;
        } else {
            this.type = type;
            this.useCapture = useCapture;
            this.listenerScope = listenerScope;

            js.append(String.format(Locale.US, jsBase + ".listen(%s, %b, %s);", type, useCapture, listenerScope));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".listen(%s, %b, %s);", type, useCapture, listenerScope));
                js.setLength(0);
            }
        }
    }

    private String type1;
    private Boolean useCapture1;
    private String listenerScope1;

    public void setListenonce(String type1, Boolean useCapture1, String listenerScope1) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            
            this.type1 = type1;
            this.useCapture = null;
            this.useCapture1 = null;
            
            this.useCapture1 = useCapture1;
            this.listenerScope = null;
            this.listenerScope1 = null;
            
            this.listenerScope1 = listenerScope1;
        } else {
            this.type1 = type1;
            this.useCapture1 = useCapture1;
            this.listenerScope1 = listenerScope1;

            js.append(String.format(Locale.US, jsBase + ".listenOnce(%s, %b, %s);", type1, useCapture1, listenerScope1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".listenOnce(%s, %b, %s);", type1, useCapture1, listenerScope1));
                js.setLength(0);
            }
        }
    }

    private Margin getmargin;

    public Margin getMargin() {
        if (getmargin == null)
            getmargin = new Margin(jsBase + ".margin()");

        return getmargin;
    }

    private Double[] margin;
    private String[] margin1;
    private String margin2;
    private Double margin3;
    private String margin4;

    public void setMargin(Double[] margin) {
        if (jsBase == null) {
            this.margin = null;
            this.margin1 = null;
            this.margin2 = null;
            this.margin3 = null;
            this.margin4 = null;
            
            this.margin = margin;
        } else {
            this.margin = margin;

            js.append(String.format(Locale.US, jsBase + ".margin(%s);", Arrays.toString(margin)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s);", Arrays.toString(margin)));
                js.setLength(0);
            }
        }
    }


    public void setMargin(String[] margin1) {
        if (jsBase == null) {
            this.margin = null;
            this.margin1 = null;
            this.margin2 = null;
            this.margin3 = null;
            this.margin4 = null;
            
            this.margin1 = margin1;
        } else {
            this.margin1 = margin1;

            js.append(String.format(Locale.US, jsBase + ".margin(%s);", Arrays.toString(margin1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s);", Arrays.toString(margin1)));
                js.setLength(0);
            }
        }
    }


    public void setMargin(String margin2) {
        if (jsBase == null) {
            this.margin = null;
            this.margin1 = null;
            this.margin2 = null;
            this.margin3 = null;
            this.margin4 = null;
            
            this.margin2 = margin2;
        } else {
            this.margin2 = margin2;

            js.append(String.format(Locale.US, jsBase + ".margin(%s);", margin2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s);", margin2));
                js.setLength(0);
            }
        }
    }


    public void setMargin(Double margin3) {
        if (jsBase == null) {
            this.margin = null;
            this.margin1 = null;
            this.margin2 = null;
            this.margin3 = null;
            this.margin4 = null;
            
            this.margin3 = margin3;
        } else {
            this.margin3 = margin3;

            js.append(String.format(Locale.US, jsBase + ".margin(%f);", margin3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%f);", margin3));
                js.setLength(0);
            }
        }
    }

    private String value;
    private Double value1;
    private String value2;
    private Double value3;
    private String value4;
    private Double value5;
    private String value6;
    private Double value7;

    public void setMargin(String value6, String value, Double value1, String value2, Double value3, String value4, Double value5) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value6 = value6;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value = value;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value1 = value1;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value2 = value2;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value3 = value3;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value4 = value4;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value5 = value5;
        } else {
            this.value6 = value6;
            this.value = value;
            this.value1 = value1;
            this.value2 = value2;
            this.value3 = value3;
            this.value4 = value4;
            this.value5 = value5;

            js.append(String.format(Locale.US, jsBase + ".margin(%s, %s, %f, %s, %f, %s, %f);", value6, value, value1, value2, value3, value4, value5));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %s, %f, %s, %f, %s, %f);", value6, value, value1, value2, value3, value4, value5));
                js.setLength(0);
            }
        }
    }


    public void setMargin(Double value7, String value, Double value1, String value2, Double value3, String value4, Double value5) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value7 = value7;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value = value;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value1 = value1;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value2 = value2;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value3 = value3;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value4 = value4;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value5 = value5;
        } else {
            this.value7 = value7;
            this.value = value;
            this.value1 = value1;
            this.value2 = value2;
            this.value3 = value3;
            this.value4 = value4;
            this.value5 = value5;

            js.append(String.format(Locale.US, jsBase + ".margin(%f, %s, %f, %s, %f, %s, %f);", value7, value, value1, value2, value3, value4, value5));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%f, %s, %f, %s, %f, %s, %f);", value7, value, value1, value2, value3, value4, value5));
                js.setLength(0);
            }
        }
    }

    private Double maxHeight;
    private String maxHeight1;

    public void setMaxheight(Double maxHeight) {
        if (jsBase == null) {
            this.maxHeight = null;
            this.maxHeight1 = null;
            
            this.maxHeight = maxHeight;
        } else {
            this.maxHeight = maxHeight;

            js.append(String.format(Locale.US, jsBase + ".maxHeight(%f);", maxHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".maxHeight(%f);", maxHeight));
                js.setLength(0);
            }
        }
    }


    public void setMaxheight(String maxHeight1) {
        if (jsBase == null) {
            this.maxHeight = null;
            this.maxHeight1 = null;
            
            this.maxHeight1 = maxHeight1;
        } else {
            this.maxHeight1 = maxHeight1;

            js.append(String.format(Locale.US, jsBase + ".maxHeight(%s);", maxHeight1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".maxHeight(%s);", maxHeight1));
                js.setLength(0);
            }
        }
    }

    private Double maxWidth;
    private String maxWidth1;

    public void setMaxwidth(Double maxWidth) {
        if (jsBase == null) {
            this.maxWidth = null;
            this.maxWidth1 = null;
            
            this.maxWidth = maxWidth;
        } else {
            this.maxWidth = maxWidth;

            js.append(String.format(Locale.US, jsBase + ".maxWidth(%f);", maxWidth));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".maxWidth(%f);", maxWidth));
                js.setLength(0);
            }
        }
    }


    public void setMaxwidth(String maxWidth1) {
        if (jsBase == null) {
            this.maxWidth = null;
            this.maxWidth1 = null;
            
            this.maxWidth1 = maxWidth1;
        } else {
            this.maxWidth1 = maxWidth1;

            js.append(String.format(Locale.US, jsBase + ".maxWidth(%s);", maxWidth1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".maxWidth(%s);", maxWidth1));
                js.setLength(0);
            }
        }
    }

    private UtilsPadding getpadding;

    public UtilsPadding getPadding() {
        if (getpadding == null)
            getpadding = new UtilsPadding(jsBase + ".padding()");

        return getpadding;
    }

    private Double[] padding;
    private String[] padding1;
    private String padding2;
    private Double padding3;
    private String padding4;

    public void setPadding(Double[] padding) {
        if (jsBase == null) {
            this.padding = null;
            this.padding1 = null;
            this.padding2 = null;
            this.padding3 = null;
            this.padding4 = null;
            
            this.padding = padding;
        } else {
            this.padding = padding;

            js.append(String.format(Locale.US, jsBase + ".padding(%s);", Arrays.toString(padding)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s);", Arrays.toString(padding)));
                js.setLength(0);
            }
        }
    }


    public void setPadding(String[] padding1) {
        if (jsBase == null) {
            this.padding = null;
            this.padding1 = null;
            this.padding2 = null;
            this.padding3 = null;
            this.padding4 = null;
            
            this.padding1 = padding1;
        } else {
            this.padding1 = padding1;

            js.append(String.format(Locale.US, jsBase + ".padding(%s);", Arrays.toString(padding1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s);", Arrays.toString(padding1)));
                js.setLength(0);
            }
        }
    }


    public void setPadding(String padding2) {
        if (jsBase == null) {
            this.padding = null;
            this.padding1 = null;
            this.padding2 = null;
            this.padding3 = null;
            this.padding4 = null;
            
            this.padding2 = padding2;
        } else {
            this.padding2 = padding2;

            js.append(String.format(Locale.US, jsBase + ".padding(%s);", padding2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s);", padding2));
                js.setLength(0);
            }
        }
    }


    public void setPadding(Double padding3) {
        if (jsBase == null) {
            this.padding = null;
            this.padding1 = null;
            this.padding2 = null;
            this.padding3 = null;
            this.padding4 = null;
            
            this.padding3 = padding3;
        } else {
            this.padding3 = padding3;

            js.append(String.format(Locale.US, jsBase + ".padding(%f);", padding3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%f);", padding3));
                js.setLength(0);
            }
        }
    }

    private String value8;
    private Double value9;
    private String value10;
    private Double value11;
    private String value12;
    private Double value13;
    private String value14;
    private Double value15;

    public void setPadding(String value14, String value8, Double value9, String value10, Double value11, String value12, Double value13) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value14 = value14;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value8 = value8;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value9 = value9;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value10 = value10;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value11 = value11;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value12 = value12;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value13 = value13;
        } else {
            this.value14 = value14;
            this.value8 = value8;
            this.value9 = value9;
            this.value10 = value10;
            this.value11 = value11;
            this.value12 = value12;
            this.value13 = value13;

            js.append(String.format(Locale.US, jsBase + ".padding(%s, %s, %f, %s, %f, %s, %f);", value14, value8, value9, value10, value11, value12, value13));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s, %s, %f, %s, %f, %s, %f);", value14, value8, value9, value10, value11, value12, value13));
                js.setLength(0);
            }
        }
    }


    public void setPadding(Double value15, String value8, Double value9, String value10, Double value11, String value12, Double value13) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value15 = value15;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value8 = value8;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value9 = value9;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value10 = value10;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value11 = value11;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value12 = value12;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value13 = value13;
        } else {
            this.value15 = value15;
            this.value8 = value8;
            this.value9 = value9;
            this.value10 = value10;
            this.value11 = value11;
            this.value12 = value12;
            this.value13 = value13;

            js.append(String.format(Locale.US, jsBase + ".padding(%f, %s, %f, %s, %f, %s, %f);", value15, value8, value9, value10, value11, value12, value13));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%f, %s, %f, %s, %f, %s, %f);", value15, value8, value9, value10, value11, value12, value13));
                js.setLength(0);
            }
        }
    }

    private Paginator getpaginator;

    public Paginator getPaginator() {
        if (getpaginator == null)
            getpaginator = new Paginator(jsBase + ".paginator()");

        return getpaginator;
    }

    private String paginator;
    private Boolean paginator1;

    public void setPaginator(String paginator) {
        if (jsBase == null) {
            this.paginator = null;
            this.paginator1 = null;
            
            this.paginator = paginator;
        } else {
            this.paginator = paginator;

            js.append(String.format(Locale.US, jsBase + ".paginator(%s);", paginator));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".paginator(%s);", paginator));
                js.setLength(0);
            }
        }
    }


    public void setPaginator(Boolean paginator1) {
        if (jsBase == null) {
            this.paginator = null;
            this.paginator1 = null;
            
            this.paginator1 = paginator1;
        } else {
            this.paginator1 = paginator1;

            js.append(String.format(Locale.US, jsBase + ".paginator(%b);", paginator1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".paginator(%b);", paginator1));
                js.setLength(0);
            }
        }
    }

    private Orientation position;
    private String position1;

    public void setPosition(Orientation position) {
        if (jsBase == null) {
            this.position = null;
            this.position1 = null;
            
            this.position = position;
        } else {
            this.position = position;

            js.append(String.format(Locale.US, jsBase + ".position(%s);", (position != null) ? position.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".position(%s);", (position != null) ? position.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setPosition(String position1) {
        if (jsBase == null) {
            this.position = null;
            this.position1 = null;
            
            this.position1 = position1;
        } else {
            this.position1 = position1;

            js.append(String.format(Locale.US, jsBase + ".position(%s);", position1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".position(%s);", position1));
                js.setLength(0);
            }
        }
    }

    private LegendPositionMode positionMode;
    private String positionMode1;

    public void setPositionmode(LegendPositionMode positionMode) {
        if (jsBase == null) {
            this.positionMode = null;
            this.positionMode1 = null;
            
            this.positionMode = positionMode;
        } else {
            this.positionMode = positionMode;

            js.append(String.format(Locale.US, jsBase + ".positionMode(%s);", (positionMode != null) ? positionMode.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".positionMode(%s);", (positionMode != null) ? positionMode.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setPositionmode(String positionMode1) {
        if (jsBase == null) {
            this.positionMode = null;
            this.positionMode1 = null;
            
            this.positionMode1 = positionMode1;
        } else {
            this.positionMode1 = positionMode1;

            js.append(String.format(Locale.US, jsBase + ".positionMode(%s);", positionMode1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".positionMode(%s);", positionMode1));
                js.setLength(0);
            }
        }
    }

    private PaperSize paperSizeOrOptions;
    private String paperSizeOrOptions1;
    private Boolean landscape;

    public void setPrint(PaperSize paperSizeOrOptions, Boolean landscape) {
        if (jsBase == null) {
            this.paperSizeOrOptions = null;
            this.paperSizeOrOptions1 = null;
            
            this.paperSizeOrOptions = paperSizeOrOptions;
            this.landscape = landscape;
        } else {
            this.paperSizeOrOptions = paperSizeOrOptions;
            this.landscape = landscape;

            js.append(String.format(Locale.US, jsBase + ".print(%s, %b);", (paperSizeOrOptions != null) ? paperSizeOrOptions.generateJs() : "null", landscape));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".print(%s, %b);", (paperSizeOrOptions != null) ? paperSizeOrOptions.generateJs() : "null", landscape));
                js.setLength(0);
            }
        }
    }


    public void setPrint(String paperSizeOrOptions1, Boolean landscape) {
        if (jsBase == null) {
            this.paperSizeOrOptions = null;
            this.paperSizeOrOptions1 = null;
            
            this.paperSizeOrOptions1 = paperSizeOrOptions1;
            this.landscape = landscape;
        } else {
            this.paperSizeOrOptions1 = paperSizeOrOptions1;
            this.landscape = landscape;

            js.append(String.format(Locale.US, jsBase + ".print(%s, %b);", paperSizeOrOptions1, landscape));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".print(%s, %b);", paperSizeOrOptions1, landscape));
                js.setLength(0);
            }
        }
    }

    private String type2;

    public void setRemovealllisteners(String type2) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            
            this.type2 = type2;
        } else {
            this.type2 = type2;

            js.append(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", type2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", type2));
                js.setLength(0);
            }
        }
    }

    private Boolean selectable;

    public void setSelectable(Boolean selectable) {
        if (jsBase == null) {
            this.selectable = selectable;
        } else {
            this.selectable = selectable;

            js.append(String.format(Locale.US, jsBase + ".selectable(%b);", selectable));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectable(%b);", selectable));
                js.setLength(0);
            }
        }
    }

    private Direction textDirection;
    private String textDirection1;

    public void setTextdirection(Direction textDirection) {
        if (jsBase == null) {
            this.textDirection = null;
            this.textDirection1 = null;
            
            this.textDirection = textDirection;
        } else {
            this.textDirection = textDirection;

            js.append(String.format(Locale.US, jsBase + ".textDirection(%s);", (textDirection != null) ? textDirection.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textDirection(%s);", (textDirection != null) ? textDirection.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setTextdirection(String textDirection1) {
        if (jsBase == null) {
            this.textDirection = null;
            this.textDirection1 = null;
            
            this.textDirection1 = textDirection1;
        } else {
            this.textDirection1 = textDirection1;

            js.append(String.format(Locale.US, jsBase + ".textDirection(%s);", textDirection1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textDirection(%s);", textDirection1));
                js.setLength(0);
            }
        }
    }

    private Double textIndent;

    public void setTextindent(Double textIndent) {
        if (jsBase == null) {
            this.textIndent = textIndent;
        } else {
            this.textIndent = textIndent;

            js.append(String.format(Locale.US, jsBase + ".textIndent(%f);", textIndent));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textIndent(%f);", textIndent));
                js.setLength(0);
            }
        }
    }

    private TextOverflow textOverflow;
    private String textOverflow1;

    public void setTextoverflow(TextOverflow textOverflow) {
        if (jsBase == null) {
            this.textOverflow = null;
            this.textOverflow1 = null;
            
            this.textOverflow = textOverflow;
        } else {
            this.textOverflow = textOverflow;

            js.append(String.format(Locale.US, jsBase + ".textOverflow(%s);", (textOverflow != null) ? textOverflow.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textOverflow(%s);", (textOverflow != null) ? textOverflow.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setTextoverflow(String textOverflow1) {
        if (jsBase == null) {
            this.textOverflow = null;
            this.textOverflow1 = null;
            
            this.textOverflow1 = textOverflow1;
        } else {
            this.textOverflow1 = textOverflow1;

            js.append(String.format(Locale.US, jsBase + ".textOverflow(%s);", textOverflow1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textOverflow(%s);", textOverflow1));
                js.setLength(0);
            }
        }
    }

    private String name;

    public void setTextsettings(String name) {
        if (jsBase == null) {
            this.name = name;
        } else {
            this.name = name;

            js.append(String.format(Locale.US, jsBase + ".textSettings(%s);", name));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textSettings(%s);", name));
                js.setLength(0);
            }
        }
    }

    private String objectWithSettings;
    private String name1;
    private String textSettings;
    private Double textSettings1;
    private Boolean textSettings2;

    public void setTextsettings(String textSettings, String name1) {
        if (jsBase == null) {
            this.textSettings = null;
            this.textSettings1 = null;
            this.textSettings2 = null;
            
            this.textSettings = textSettings;
            this.name = null;
            this.name1 = null;
            
            this.name1 = name1;
        } else {
            this.textSettings = textSettings;
            this.name1 = name1;

            js.append(String.format(Locale.US, jsBase + ".textSettings(%s, %s);", textSettings, name1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textSettings(%s, %s);", textSettings, name1));
                js.setLength(0);
            }
        }
    }


    public void setTextsettings(Double textSettings1, String name1) {
        if (jsBase == null) {
            this.textSettings = null;
            this.textSettings1 = null;
            this.textSettings2 = null;
            
            this.textSettings1 = textSettings1;
            this.name = null;
            this.name1 = null;
            
            this.name1 = name1;
        } else {
            this.textSettings1 = textSettings1;
            this.name1 = name1;

            js.append(String.format(Locale.US, jsBase + ".textSettings(%f, %s);", textSettings1, name1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textSettings(%f, %s);", textSettings1, name1));
                js.setLength(0);
            }
        }
    }


    public void setTextsettings(Boolean textSettings2, String name1) {
        if (jsBase == null) {
            this.textSettings = null;
            this.textSettings1 = null;
            this.textSettings2 = null;
            
            this.textSettings2 = textSettings2;
            this.name = null;
            this.name1 = null;
            
            this.name1 = name1;
        } else {
            this.textSettings2 = textSettings2;
            this.name1 = name1;

            js.append(String.format(Locale.US, jsBase + ".textSettings(%b, %s);", textSettings2, name1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textSettings(%b, %s);", textSettings2, name1));
                js.setLength(0);
            }
        }
    }

    private TextTextWrap textWrap;
    private String textWrap1;

    public void setTextwrap(TextTextWrap textWrap) {
        if (jsBase == null) {
            this.textWrap = null;
            this.textWrap1 = null;
            
            this.textWrap = textWrap;
        } else {
            this.textWrap = textWrap;

            js.append(String.format(Locale.US, jsBase + ".textWrap(%s);", (textWrap != null) ? textWrap.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textWrap(%s);", (textWrap != null) ? textWrap.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setTextwrap(String textWrap1) {
        if (jsBase == null) {
            this.textWrap = null;
            this.textWrap1 = null;
            
            this.textWrap1 = textWrap1;
        } else {
            this.textWrap1 = textWrap1;

            js.append(String.format(Locale.US, jsBase + ".textWrap(%s);", textWrap1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textWrap(%s);", textWrap1));
                js.setLength(0);
            }
        }
    }

    private UiTitle gettitle;

    public UiTitle getTitle() {
        if (gettitle == null)
            gettitle = new UiTitle(jsBase + ".title()");

        return gettitle;
    }

    private Boolean title;
    private String title1;
    private String title2;

    public void setTitle(Boolean title) {
        if (jsBase == null) {
            this.title = null;
            this.title1 = null;
            this.title2 = null;
            
            this.title = title;
        } else {
            this.title = title;

            js.append(String.format(Locale.US, jsBase + ".title(%b);", title));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".title(%b);", title));
                js.setLength(0);
            }
        }
    }


    public void setTitle(String title1) {
        if (jsBase == null) {
            this.title = null;
            this.title1 = null;
            this.title2 = null;
            
            this.title1 = title1;
        } else {
            this.title1 = title1;

            js.append(String.format(Locale.US, jsBase + ".title(%s);", title1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".title(%s);", title1));
                js.setLength(0);
            }
        }
    }

    private String titleFormat;

    public void setTitleformat(String titleFormat) {
        if (jsBase == null) {
            this.titleFormat = titleFormat;
        } else {
            this.titleFormat = titleFormat;

            js.append(String.format(Locale.US, jsBase + ".titleFormat(%s);", titleFormat));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".titleFormat(%s);", titleFormat));
                js.setLength(0);
            }
        }
    }

    private Separator gettitleSeparator;

    public Separator getTitleseparator() {
        if (gettitleSeparator == null)
            gettitleSeparator = new Separator(jsBase + ".titleSeparator()");

        return gettitleSeparator;
    }

    private String titleSeparator;
    private Boolean titleSeparator1;

    public void setTitleseparator(String titleSeparator) {
        if (jsBase == null) {
            this.titleSeparator = null;
            this.titleSeparator1 = null;
            
            this.titleSeparator = titleSeparator;
        } else {
            this.titleSeparator = titleSeparator;

            js.append(String.format(Locale.US, jsBase + ".titleSeparator(%s);", titleSeparator));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".titleSeparator(%s);", titleSeparator));
                js.setLength(0);
            }
        }
    }


    public void setTitleseparator(Boolean titleSeparator1) {
        if (jsBase == null) {
            this.titleSeparator = null;
            this.titleSeparator1 = null;
            
            this.titleSeparator1 = titleSeparator1;
        } else {
            this.titleSeparator1 = titleSeparator1;

            js.append(String.format(Locale.US, jsBase + ".titleSeparator(%b);", titleSeparator1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".titleSeparator(%b);", titleSeparator1));
                js.setLength(0);
            }
        }
    }

    private Tooltip gettooltip;

    public Tooltip getTooltip() {
        if (gettooltip == null)
            gettooltip = new Tooltip(jsBase + ".tooltip()");

        return gettooltip;
    }

    private String tooltip;
    private Boolean tooltip1;

    public void setTooltip(String tooltip) {
        if (jsBase == null) {
            this.tooltip = null;
            this.tooltip1 = null;
            
            this.tooltip = tooltip;
        } else {
            this.tooltip = tooltip;

            js.append(String.format(Locale.US, jsBase + ".tooltip(%s);", tooltip));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".tooltip(%s);", tooltip));
                js.setLength(0);
            }
        }
    }


    public void setTooltip(Boolean tooltip1) {
        if (jsBase == null) {
            this.tooltip = null;
            this.tooltip1 = null;
            
            this.tooltip1 = tooltip1;
        } else {
            this.tooltip1 = tooltip1;

            js.append(String.format(Locale.US, jsBase + ".tooltip(%b);", tooltip1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".tooltip(%b);", tooltip1));
                js.setLength(0);
            }
        }
    }

    private String type3;
    private Boolean useCapture2;
    private String listenerScope2;

    public void setUnlisten(String type3, Boolean useCapture2, String listenerScope2) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            this.type3 = null;
            
            this.type3 = type3;
            this.useCapture = null;
            this.useCapture1 = null;
            this.useCapture2 = null;
            
            this.useCapture2 = useCapture2;
            this.listenerScope = null;
            this.listenerScope1 = null;
            this.listenerScope2 = null;
            
            this.listenerScope2 = listenerScope2;
        } else {
            this.type3 = type3;
            this.useCapture2 = useCapture2;
            this.listenerScope2 = listenerScope2;

            js.append(String.format(Locale.US, jsBase + ".unlisten(%s, %b, %s);", type3, useCapture2, listenerScope2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unlisten(%s, %b, %s);", type3, useCapture2, listenerScope2));
                js.setLength(0);
            }
        }
    }

    private String key;

    public void setUnlistenbykey(String key) {
        if (jsBase == null) {
            this.key = key;
        } else {
            this.key = key;

            js.append(String.format(Locale.US, jsBase + ".unlistenByKey(%s);", key));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unlistenByKey(%s);", key));
                js.setLength(0);
            }
        }
    }

    private Boolean useHtml;

    public void setUsehtml(Boolean useHtml) {
        if (jsBase == null) {
            this.useHtml = useHtml;
        } else {
            this.useHtml = useHtml;

            js.append(String.format(Locale.US, jsBase + ".useHtml(%b);", useHtml));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".useHtml(%b);", useHtml));
                js.setLength(0);
            }
        }
    }

    private TextVAlign vAlign;
    private String vAlign1;

    public void setValign(TextVAlign vAlign) {
        if (jsBase == null) {
            this.vAlign = null;
            this.vAlign1 = null;
            
            this.vAlign = vAlign;
        } else {
            this.vAlign = vAlign;

            js.append(String.format(Locale.US, jsBase + ".vAlign(%s);", (vAlign != null) ? vAlign.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".vAlign(%s);", (vAlign != null) ? vAlign.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setValign(String vAlign1) {
        if (jsBase == null) {
            this.vAlign = null;
            this.vAlign1 = null;
            
            this.vAlign1 = vAlign1;
        } else {
            this.vAlign1 = vAlign1;

            js.append(String.format(Locale.US, jsBase + ".vAlign(%s);", vAlign1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".vAlign(%s);", vAlign1));
                js.setLength(0);
            }
        }
    }

    private Double width;
    private String width1;

    public void setWidth(Double width) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            
            this.width = width;
        } else {
            this.width = width;

            js.append(String.format(Locale.US, jsBase + ".width(%f);", width));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".width(%f);", width));
                js.setLength(0);
            }
        }
    }


    public void setWidth(String width1) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            
            this.width1 = width1;
        } else {
            this.width1 = width1;

            js.append(String.format(Locale.US, jsBase + ".width(%s);", width1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".width(%s);", width1));
                js.setLength(0);
            }
        }
    }

    private Double zIndex;

    public void setZindex(Double zIndex) {
        if (jsBase == null) {
            this.zIndex = zIndex;
        } else {
            this.zIndex = zIndex;

            js.append(String.format(Locale.US, jsBase + ".zIndex(%f);", zIndex));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".zIndex(%f);", zIndex));
                js.setLength(0);
            }
        }
    }

    private String generateJSgetbackground() {
        if (getbackground != null) {
            return getbackground.generateJs();
        }
        return "";
    }

    private String generateJSgetgetRemainingBounds() {
        if (getgetRemainingBounds != null) {
            return getgetRemainingBounds.generateJs();
        }
        return "";
    }

    private String generateJSgetmargin() {
        if (getmargin != null) {
            return getmargin.generateJs();
        }
        return "";
    }

    private String generateJSgetpadding() {
        if (getpadding != null) {
            return getpadding.generateJs();
        }
        return "";
    }

    private String generateJSgetpaginator() {
        if (getpaginator != null) {
            return getpaginator.generateJs();
        }
        return "";
    }

    private String generateJSgettitle() {
        if (gettitle != null) {
            return gettitle.generateJs();
        }
        return "";
    }

    private String generateJSgettitleSeparator() {
        if (gettitleSeparator != null) {
            return gettitleSeparator.generateJs();
        }
        return "";
    }

    private String generateJSgettooltip() {
        if (gettooltip != null) {
            return gettooltip.generateJs();
        }
        return "";
    }

    private String generateJSalign() {
        if (align != null) {
            return String.format(Locale.US, "align: %s,", (align != null) ? align.generateJs() : "null");
        }
        return "";
    }

    private String generateJSalign1() {
        if (align1 != null) {
            return String.format(Locale.US, "align: %s,", align1);
        }
        return "";
    }

    private String generateJSbackground() {
        if (background != null) {
            return String.format(Locale.US, "background: %s,", background);
        }
        return "";
    }

    private String generateJSbackground1() {
        if (background1 != null) {
            return String.format(Locale.US, "background: %s,", background1);
        }
        return "";
    }

    private String generateJSbackground2() {
        if (background2 != null) {
            return String.format(Locale.US, "background: %b,", background2);
        }
        return "";
    }

    private String generateJSdisablePointerEvents() {
        if (disablePointerEvents != null) {
            return String.format(Locale.US, "disablePointerEvents: %b,", disablePointerEvents);
        }
        return "";
    }

    private String generateJSdrag() {
        if (drag != null) {
            return String.format(Locale.US, "drag: %b,", drag);
        }
        return "";
    }

    private String generateJSenabled() {
        if (enabled != null) {
            return String.format(Locale.US, "enabled: %b,", enabled);
        }
        return "";
    }

    private String generateJSfontColor() {
        if (fontColor != null) {
            return String.format(Locale.US, "fontColor: %s,", fontColor);
        }
        return "";
    }

    private String generateJSfontDecoration() {
        if (fontDecoration != null) {
            return String.format(Locale.US, "fontDecoration: %s,", (fontDecoration != null) ? fontDecoration.generateJs() : "null");
        }
        return "";
    }

    private String generateJSfontDecoration1() {
        if (fontDecoration1 != null) {
            return String.format(Locale.US, "fontDecoration: %s,", fontDecoration1);
        }
        return "";
    }

    private String generateJSfontFamily() {
        if (fontFamily != null) {
            return String.format(Locale.US, "fontFamily: %s,", fontFamily);
        }
        return "";
    }

    private String generateJSfontOpacity() {
        if (fontOpacity != null) {
            return String.format(Locale.US, "fontOpacity: %f,", fontOpacity);
        }
        return "";
    }

    private String generateJSfontSize() {
        if (fontSize != null) {
            return String.format(Locale.US, "fontSize: %s,", fontSize);
        }
        return "";
    }

    private String generateJSfontSize1() {
        if (fontSize1 != null) {
            return String.format(Locale.US, "fontSize: %f,", fontSize1);
        }
        return "";
    }

    private String generateJSfontStyle() {
        if (fontStyle != null) {
            return String.format(Locale.US, "fontStyle: %s,", (fontStyle != null) ? fontStyle.generateJs() : "null");
        }
        return "";
    }

    private String generateJSfontStyle1() {
        if (fontStyle1 != null) {
            return String.format(Locale.US, "fontStyle: %s,", fontStyle1);
        }
        return "";
    }

    private String generateJSfontVariant() {
        if (fontVariant != null) {
            return String.format(Locale.US, "fontVariant: %s,", (fontVariant != null) ? fontVariant.generateJs() : "null");
        }
        return "";
    }

    private String generateJSfontVariant1() {
        if (fontVariant1 != null) {
            return String.format(Locale.US, "fontVariant: %s,", fontVariant1);
        }
        return "";
    }

    private String generateJSfontWeight() {
        if (fontWeight != null) {
            return String.format(Locale.US, "fontWeight: %s,", fontWeight);
        }
        return "";
    }

    private String generateJSfontWeight1() {
        if (fontWeight1 != null) {
            return String.format(Locale.US, "fontWeight: %f,", fontWeight1);
        }
        return "";
    }

    private String generateJShAlign() {
        if (hAlign != null) {
            return String.format(Locale.US, "hAlign: %s,", (hAlign != null) ? hAlign.generateJs() : "null");
        }
        return "";
    }

    private String generateJShAlign1() {
        if (hAlign1 != null) {
            return String.format(Locale.US, "hAlign: %s,", hAlign1);
        }
        return "";
    }

    private String generateJSheight() {
        if (height != null) {
            return String.format(Locale.US, "height: %f,", height);
        }
        return "";
    }

    private String generateJSheight1() {
        if (height1 != null) {
            return String.format(Locale.US, "height: %s,", height1);
        }
        return "";
    }

    private String generateJShoverCursor() {
        if (hoverCursor != null) {
            return String.format(Locale.US, "hoverCursor: %s,", (hoverCursor != null) ? hoverCursor.generateJs() : "null");
        }
        return "";
    }

    private String generateJShoverCursor1() {
        if (hoverCursor1 != null) {
            return String.format(Locale.US, "hoverCursor: %s,", hoverCursor1);
        }
        return "";
    }

    private String generateJSiconSize() {
        if (iconSize != null) {
            return String.format(Locale.US, "iconSize: %f,", iconSize);
        }
        return "";
    }

    private String generateJSiconSize1() {
        if (iconSize1 != null) {
            return String.format(Locale.US, "iconSize: %s,", iconSize1);
        }
        return "";
    }

    private String generateJSiconTextSpacing() {
        if (iconTextSpacing != null) {
            return String.format(Locale.US, "iconTextSpacing: %s,", iconTextSpacing);
        }
        return "";
    }

    private String generateJSiconTextSpacing1() {
        if (iconTextSpacing1 != null) {
            return String.format(Locale.US, "iconTextSpacing: %f,", iconTextSpacing1);
        }
        return "";
    }

    private String generateJSinverted() {
        if (inverted != null) {
            return String.format(Locale.US, "inverted: %b,", inverted);
        }
        return "";
    }

    private String generateJSitems() {
        if (items != null) {
            return String.format(Locale.US, "items: %s,", arrayToString(items));
        }
        return "";
    }

    private String generateJSitemsLayout() {
        if (itemsLayout != null) {
            return String.format(Locale.US, "itemsLayout: %s,", itemsLayout);
        }
        return "";
    }

    private String generateJSitemsLayout1() {
        if (itemsLayout1 != null) {
            return String.format(Locale.US, "itemsLayout: %s,", (itemsLayout1 != null) ? itemsLayout1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSitemsSourceMode() {
        if (itemsSourceMode != null) {
            return String.format(Locale.US, "itemsSourceMode: %s,", itemsSourceMode);
        }
        return "";
    }

    private String generateJSitemsSourceMode1() {
        if (itemsSourceMode1 != null) {
            return String.format(Locale.US, "itemsSourceMode: %s,", (itemsSourceMode1 != null) ? itemsSourceMode1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSitemsSpacing() {
        if (itemsSpacing != null) {
            return String.format(Locale.US, "itemsSpacing: %s,", itemsSpacing);
        }
        return "";
    }

    private String generateJSitemsSpacing1() {
        if (itemsSpacing1 != null) {
            return String.format(Locale.US, "itemsSpacing: %f,", itemsSpacing1);
        }
        return "";
    }

    private String generateJSletterSpacing() {
        if (letterSpacing != null) {
            return String.format(Locale.US, "letterSpacing: %s,", letterSpacing);
        }
        return "";
    }

    private String generateJSletterSpacing1() {
        if (letterSpacing1 != null) {
            return String.format(Locale.US, "letterSpacing: %f,", letterSpacing1);
        }
        return "";
    }

    private String generateJSlineHeight() {
        if (lineHeight != null) {
            return String.format(Locale.US, "lineHeight: %s,", lineHeight);
        }
        return "";
    }

    private String generateJSlineHeight1() {
        if (lineHeight1 != null) {
            return String.format(Locale.US, "lineHeight: %f,", lineHeight1);
        }
        return "";
    }

    private String generateJStype() {
        if (type != null) {
            return String.format(Locale.US, "type: %s,", type);
        }
        return "";
    }

    private String generateJSuseCapture() {
        if (useCapture != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture);
        }
        return "";
    }

    private String generateJSlistenerScope() {
        if (listenerScope != null) {
            return String.format(Locale.US, "listenerScope: %s,", listenerScope);
        }
        return "";
    }

    private String generateJStype1() {
        if (type1 != null) {
            return String.format(Locale.US, "type: %s,", type1);
        }
        return "";
    }

    private String generateJSuseCapture1() {
        if (useCapture1 != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture1);
        }
        return "";
    }

    private String generateJSlistenerScope1() {
        if (listenerScope1 != null) {
            return String.format(Locale.US, "listenerScope: %s,", listenerScope1);
        }
        return "";
    }

    private String generateJSmargin() {
        if (margin != null) {
            return String.format(Locale.US, "margin: %s,", Arrays.toString(margin));
        }
        return "";
    }

    private String generateJSmargin1() {
        if (margin1 != null) {
            return String.format(Locale.US, "margin: %s,", Arrays.toString(margin1));
        }
        return "";
    }

    private String generateJSmargin2() {
        if (margin2 != null) {
            return String.format(Locale.US, "margin: %s,", margin2);
        }
        return "";
    }

    private String generateJSmargin3() {
        if (margin3 != null) {
            return String.format(Locale.US, "margin: %f,", margin3);
        }
        return "";
    }

    private String generateJSmargin4() {
        if (margin4 != null) {
            return String.format(Locale.US, "margin: %s,", margin4);
        }
        return "";
    }

    private String generateJSvalue() {
        if (value != null) {
            return String.format(Locale.US, "value: %s,", value);
        }
        return "";
    }

    private String generateJSvalue1() {
        if (value1 != null) {
            return String.format(Locale.US, "value: %f,", value1);
        }
        return "";
    }

    private String generateJSvalue2() {
        if (value2 != null) {
            return String.format(Locale.US, "value: %s,", value2);
        }
        return "";
    }

    private String generateJSvalue3() {
        if (value3 != null) {
            return String.format(Locale.US, "value: %f,", value3);
        }
        return "";
    }

    private String generateJSvalue4() {
        if (value4 != null) {
            return String.format(Locale.US, "value: %s,", value4);
        }
        return "";
    }

    private String generateJSvalue5() {
        if (value5 != null) {
            return String.format(Locale.US, "value: %f,", value5);
        }
        return "";
    }

    private String generateJSvalue6() {
        if (value6 != null) {
            return String.format(Locale.US, "value: %s,", value6);
        }
        return "";
    }

    private String generateJSvalue7() {
        if (value7 != null) {
            return String.format(Locale.US, "value: %f,", value7);
        }
        return "";
    }

    private String generateJSmaxHeight() {
        if (maxHeight != null) {
            return String.format(Locale.US, "maxHeight: %f,", maxHeight);
        }
        return "";
    }

    private String generateJSmaxHeight1() {
        if (maxHeight1 != null) {
            return String.format(Locale.US, "maxHeight: %s,", maxHeight1);
        }
        return "";
    }

    private String generateJSmaxWidth() {
        if (maxWidth != null) {
            return String.format(Locale.US, "maxWidth: %f,", maxWidth);
        }
        return "";
    }

    private String generateJSmaxWidth1() {
        if (maxWidth1 != null) {
            return String.format(Locale.US, "maxWidth: %s,", maxWidth1);
        }
        return "";
    }

    private String generateJSpadding() {
        if (padding != null) {
            return String.format(Locale.US, "padding: %s,", Arrays.toString(padding));
        }
        return "";
    }

    private String generateJSpadding1() {
        if (padding1 != null) {
            return String.format(Locale.US, "padding: %s,", Arrays.toString(padding1));
        }
        return "";
    }

    private String generateJSpadding2() {
        if (padding2 != null) {
            return String.format(Locale.US, "padding: %s,", padding2);
        }
        return "";
    }

    private String generateJSpadding3() {
        if (padding3 != null) {
            return String.format(Locale.US, "padding: %f,", padding3);
        }
        return "";
    }

    private String generateJSpadding4() {
        if (padding4 != null) {
            return String.format(Locale.US, "padding: %s,", padding4);
        }
        return "";
    }

    private String generateJSvalue8() {
        if (value8 != null) {
            return String.format(Locale.US, "value: %s,", value8);
        }
        return "";
    }

    private String generateJSvalue9() {
        if (value9 != null) {
            return String.format(Locale.US, "value: %f,", value9);
        }
        return "";
    }

    private String generateJSvalue10() {
        if (value10 != null) {
            return String.format(Locale.US, "value: %s,", value10);
        }
        return "";
    }

    private String generateJSvalue11() {
        if (value11 != null) {
            return String.format(Locale.US, "value: %f,", value11);
        }
        return "";
    }

    private String generateJSvalue12() {
        if (value12 != null) {
            return String.format(Locale.US, "value: %s,", value12);
        }
        return "";
    }

    private String generateJSvalue13() {
        if (value13 != null) {
            return String.format(Locale.US, "value: %f,", value13);
        }
        return "";
    }

    private String generateJSvalue14() {
        if (value14 != null) {
            return String.format(Locale.US, "value: %s,", value14);
        }
        return "";
    }

    private String generateJSvalue15() {
        if (value15 != null) {
            return String.format(Locale.US, "value: %f,", value15);
        }
        return "";
    }

    private String generateJSpaginator() {
        if (paginator != null) {
            return String.format(Locale.US, "paginator: %s,", paginator);
        }
        return "";
    }

    private String generateJSpaginator1() {
        if (paginator1 != null) {
            return String.format(Locale.US, "paginator: %b,", paginator1);
        }
        return "";
    }

    private String generateJSposition() {
        if (position != null) {
            return String.format(Locale.US, "position: %s,", (position != null) ? position.generateJs() : "null");
        }
        return "";
    }

    private String generateJSposition1() {
        if (position1 != null) {
            return String.format(Locale.US, "position: %s,", position1);
        }
        return "";
    }

    private String generateJSpositionMode() {
        if (positionMode != null) {
            return String.format(Locale.US, "positionMode: %s,", (positionMode != null) ? positionMode.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpositionMode1() {
        if (positionMode1 != null) {
            return String.format(Locale.US, "positionMode: %s,", positionMode1);
        }
        return "";
    }

    private String generateJSpaperSizeOrOptions() {
        if (paperSizeOrOptions != null) {
            return String.format(Locale.US, "paperSizeOrOptions: %s,", (paperSizeOrOptions != null) ? paperSizeOrOptions.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpaperSizeOrOptions1() {
        if (paperSizeOrOptions1 != null) {
            return String.format(Locale.US, "paperSizeOrOptions: %s,", paperSizeOrOptions1);
        }
        return "";
    }

    private String generateJSlandscape() {
        if (landscape != null) {
            return String.format(Locale.US, "landscape: %b,", landscape);
        }
        return "";
    }

    private String generateJStype2() {
        if (type2 != null) {
            return String.format(Locale.US, "type: %s,", type2);
        }
        return "";
    }

    private String generateJSselectable() {
        if (selectable != null) {
            return String.format(Locale.US, "selectable: %b,", selectable);
        }
        return "";
    }

    private String generateJStextDirection() {
        if (textDirection != null) {
            return String.format(Locale.US, "textDirection: %s,", (textDirection != null) ? textDirection.generateJs() : "null");
        }
        return "";
    }

    private String generateJStextDirection1() {
        if (textDirection1 != null) {
            return String.format(Locale.US, "textDirection: %s,", textDirection1);
        }
        return "";
    }

    private String generateJStextIndent() {
        if (textIndent != null) {
            return String.format(Locale.US, "textIndent: %f,", textIndent);
        }
        return "";
    }

    private String generateJStextOverflow() {
        if (textOverflow != null) {
            return String.format(Locale.US, "textOverflow: %s,", (textOverflow != null) ? textOverflow.generateJs() : "null");
        }
        return "";
    }

    private String generateJStextOverflow1() {
        if (textOverflow1 != null) {
            return String.format(Locale.US, "textOverflow: %s,", textOverflow1);
        }
        return "";
    }

    private String generateJSname() {
        if (name != null) {
            return String.format(Locale.US, "name: %s,", name);
        }
        return "";
    }

    private String generateJSobjectWithSettings() {
        if (objectWithSettings != null) {
            return String.format(Locale.US, "objectWithSettings: %s,", objectWithSettings);
        }
        return "";
    }

    private String generateJSname1() {
        if (name1 != null) {
            return String.format(Locale.US, "name: %s,", name1);
        }
        return "";
    }

    private String generateJStextSettings() {
        if (textSettings != null) {
            return String.format(Locale.US, "textSettings: %s,", textSettings);
        }
        return "";
    }

    private String generateJStextSettings1() {
        if (textSettings1 != null) {
            return String.format(Locale.US, "textSettings: %f,", textSettings1);
        }
        return "";
    }

    private String generateJStextSettings2() {
        if (textSettings2 != null) {
            return String.format(Locale.US, "textSettings: %b,", textSettings2);
        }
        return "";
    }

    private String generateJStextWrap() {
        if (textWrap != null) {
            return String.format(Locale.US, "textWrap: %s,", (textWrap != null) ? textWrap.generateJs() : "null");
        }
        return "";
    }

    private String generateJStextWrap1() {
        if (textWrap1 != null) {
            return String.format(Locale.US, "textWrap: %s,", textWrap1);
        }
        return "";
    }

    private String generateJStitle() {
        if (title != null) {
            return String.format(Locale.US, "title: %b,", title);
        }
        return "";
    }

    private String generateJStitle1() {
        if (title1 != null) {
            return String.format(Locale.US, "title: %s,", title1);
        }
        return "";
    }

    private String generateJStitle2() {
        if (title2 != null) {
            return String.format(Locale.US, "title: %s,", title2);
        }
        return "";
    }

    private String generateJStitleFormat() {
        if (titleFormat != null) {
            return String.format(Locale.US, "titleFormat: %s,", titleFormat);
        }
        return "";
    }

    private String generateJStitleSeparator() {
        if (titleSeparator != null) {
            return String.format(Locale.US, "titleSeparator: %s,", titleSeparator);
        }
        return "";
    }

    private String generateJStitleSeparator1() {
        if (titleSeparator1 != null) {
            return String.format(Locale.US, "titleSeparator: %b,", titleSeparator1);
        }
        return "";
    }

    private String generateJStooltip() {
        if (tooltip != null) {
            return String.format(Locale.US, "tooltip: %s,", tooltip);
        }
        return "";
    }

    private String generateJStooltip1() {
        if (tooltip1 != null) {
            return String.format(Locale.US, "tooltip: %b,", tooltip1);
        }
        return "";
    }

    private String generateJStype3() {
        if (type3 != null) {
            return String.format(Locale.US, "type: %s,", type3);
        }
        return "";
    }

    private String generateJSuseCapture2() {
        if (useCapture2 != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture2);
        }
        return "";
    }

    private String generateJSlistenerScope2() {
        if (listenerScope2 != null) {
            return String.format(Locale.US, "listenerScope: %s,", listenerScope2);
        }
        return "";
    }

    private String generateJSkey() {
        if (key != null) {
            return String.format(Locale.US, "key: %s,", key);
        }
        return "";
    }

    private String generateJSuseHtml() {
        if (useHtml != null) {
            return String.format(Locale.US, "useHtml: %b,", useHtml);
        }
        return "";
    }

    private String generateJSvAlign() {
        if (vAlign != null) {
            return String.format(Locale.US, "vAlign: %s,", (vAlign != null) ? vAlign.generateJs() : "null");
        }
        return "";
    }

    private String generateJSvAlign1() {
        if (vAlign1 != null) {
            return String.format(Locale.US, "vAlign: %s,", vAlign1);
        }
        return "";
    }

    private String generateJSwidth() {
        if (width != null) {
            return String.format(Locale.US, "width: %f,", width);
        }
        return "";
    }

    private String generateJSwidth1() {
        if (width1 != null) {
            return String.format(Locale.US, "width: %s,", width1);
        }
        return "";
    }

    private String generateJSzIndex() {
        if (zIndex != null) {
            return String.format(Locale.US, "zIndex: %f,", zIndex);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        if (jsBase == null) {
            js.append("{");
            js.append(generateJSalign());
            js.append(generateJSalign1());
            js.append(generateJSbackground());
            js.append(generateJSbackground1());
            js.append(generateJSbackground2());
            js.append(generateJSdisablePointerEvents());
            js.append(generateJSdrag());
            js.append(generateJSenabled());
            js.append(generateJSfontColor());
            js.append(generateJSfontDecoration());
            js.append(generateJSfontDecoration1());
            js.append(generateJSfontFamily());
            js.append(generateJSfontOpacity());
            js.append(generateJSfontSize());
            js.append(generateJSfontSize1());
            js.append(generateJSfontStyle());
            js.append(generateJSfontStyle1());
            js.append(generateJSfontVariant());
            js.append(generateJSfontVariant1());
            js.append(generateJSfontWeight());
            js.append(generateJSfontWeight1());
            js.append(generateJShAlign());
            js.append(generateJShAlign1());
            js.append(generateJSheight());
            js.append(generateJSheight1());
            js.append(generateJShoverCursor());
            js.append(generateJShoverCursor1());
            js.append(generateJSiconSize());
            js.append(generateJSiconSize1());
            js.append(generateJSiconTextSpacing());
            js.append(generateJSiconTextSpacing1());
            js.append(generateJSinverted());
            js.append(generateJSitems());
            js.append(generateJSitemsLayout());
            js.append(generateJSitemsLayout1());
            js.append(generateJSitemsSourceMode());
            js.append(generateJSitemsSourceMode1());
            js.append(generateJSitemsSpacing());
            js.append(generateJSitemsSpacing1());
            js.append(generateJSletterSpacing());
            js.append(generateJSletterSpacing1());
            js.append(generateJSlineHeight());
            js.append(generateJSlineHeight1());
            js.append(generateJStype());
            js.append(generateJSuseCapture());
            js.append(generateJSlistenerScope());
            js.append(generateJStype1());
            js.append(generateJSuseCapture1());
            js.append(generateJSlistenerScope1());
            js.append(generateJSmargin());
            js.append(generateJSmargin1());
            js.append(generateJSmargin2());
            js.append(generateJSmargin3());
            js.append(generateJSmargin4());
            js.append(generateJSvalue());
            js.append(generateJSvalue1());
            js.append(generateJSvalue2());
            js.append(generateJSvalue3());
            js.append(generateJSvalue4());
            js.append(generateJSvalue5());
            js.append(generateJSvalue6());
            js.append(generateJSvalue7());
            js.append(generateJSmaxHeight());
            js.append(generateJSmaxHeight1());
            js.append(generateJSmaxWidth());
            js.append(generateJSmaxWidth1());
            js.append(generateJSpadding());
            js.append(generateJSpadding1());
            js.append(generateJSpadding2());
            js.append(generateJSpadding3());
            js.append(generateJSpadding4());
            js.append(generateJSvalue8());
            js.append(generateJSvalue9());
            js.append(generateJSvalue10());
            js.append(generateJSvalue11());
            js.append(generateJSvalue12());
            js.append(generateJSvalue13());
            js.append(generateJSvalue14());
            js.append(generateJSvalue15());
            js.append(generateJSpaginator());
            js.append(generateJSpaginator1());
            js.append(generateJSposition());
            js.append(generateJSposition1());
            js.append(generateJSpositionMode());
            js.append(generateJSpositionMode1());
            js.append(generateJSpaperSizeOrOptions());
            js.append(generateJSpaperSizeOrOptions1());
            js.append(generateJSlandscape());
            js.append(generateJStype2());
            js.append(generateJSselectable());
            js.append(generateJStextDirection());
            js.append(generateJStextDirection1());
            js.append(generateJStextIndent());
            js.append(generateJStextOverflow());
            js.append(generateJStextOverflow1());
            js.append(generateJSname());
            js.append(generateJSobjectWithSettings());
            js.append(generateJSname1());
            js.append(generateJStextSettings());
            js.append(generateJStextSettings1());
            js.append(generateJStextSettings2());
            js.append(generateJStextWrap());
            js.append(generateJStextWrap1());
            js.append(generateJStitle());
            js.append(generateJStitle1());
            js.append(generateJStitle2());
            js.append(generateJStitleFormat());
            js.append(generateJStitleSeparator());
            js.append(generateJStitleSeparator1());
            js.append(generateJStooltip());
            js.append(generateJStooltip1());
            js.append(generateJStype3());
            js.append(generateJSuseCapture2());
            js.append(generateJSlistenerScope2());
            js.append(generateJSkey());
            js.append(generateJSuseHtml());
            js.append(generateJSvAlign());
            js.append(generateJSvAlign1());
            js.append(generateJSwidth());
            js.append(generateJSwidth1());
            js.append(generateJSzIndex());
            js.append("}");
        }
            js.append(generateJSgetbackground());
            js.append(generateJSgetgetRemainingBounds());
            js.append(generateJSgetmargin());
            js.append(generateJSgetpadding());
            js.append(generateJSgetpaginator());
            js.append(generateJSgettitle());
            js.append(generateJSgettitleSeparator());
            js.append(generateJSgettooltip());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}
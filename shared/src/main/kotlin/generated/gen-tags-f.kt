package html4k

import html4k.*
import html4k.impl.*
import html4k.attributes.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

public open class FIELDSET(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("fieldset", consumer, initialAttributes), CommonAttributeGroupFacade, FlowContent {
    var disabled : Boolean
        get()  = attributeBooleanTicker.get(this, "disabled")
        set(newValue) {attributeBooleanTicker.set(this, "disabled", newValue)}

    var form : String
        get()  = attributeStringString.get(this, "form")
        set(newValue) {attributeStringString.set(this, "form", newValue)}

    var name : String
        get()  = attributeStringString.get(this, "name")
        set(newValue) {attributeStringString.set(this, "name", newValue)}


}
fun FIELDSET.legEnd(block : LEGEND.() -> Unit) : Unit = buildLEGEND(emptyMap, consumer, block)


public open class FIGURE(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("figure", consumer, initialAttributes), CommonAttributeGroupFacade, FlowContent {

}
fun FIGURE.legEnd(block : LEGEND.() -> Unit) : Unit = buildLEGEND(emptyMap, consumer, block)


public open class FOOTER(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("footer", consumer, initialAttributes), CommonAttributeGroupFacade, FlowContent {

}

public open class FORM(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("form", consumer, initialAttributes), CommonAttributeGroupFacade, FlowContent {
    var acceptCharset : String
        get()  = attributeStringString.get(this, "accept-charset")
        set(newValue) {attributeStringString.set(this, "accept-charset", newValue)}

    var action : String
        get()  = attributeStringString.get(this, "action")
        set(newValue) {attributeStringString.set(this, "action", newValue)}

    var autoComplete : Boolean
        get()  = attributeBooleanBooleanOnOff.get(this, "autocomplete")
        set(newValue) {attributeBooleanBooleanOnOff.set(this, "autocomplete", newValue)}

    var encType : FormEncType
        get()  = attributeFormEncTypeEnumFormEncTypeValues.get(this, "enctype")
        set(newValue) {attributeFormEncTypeEnumFormEncTypeValues.set(this, "enctype", newValue)}

    var method : FormMethod
        get()  = attributeFormMethodEnumFormMethodValues.get(this, "method")
        set(newValue) {attributeFormMethodEnumFormMethodValues.set(this, "method", newValue)}

    var name : String
        get()  = attributeStringString.get(this, "name")
        set(newValue) {attributeStringString.set(this, "name", newValue)}

    var novalidate : Boolean
        get()  = attributeBooleanTicker.get(this, "novalidate")
        set(newValue) {attributeBooleanTicker.set(this, "novalidate", newValue)}

    var target : String
        get()  = attributeStringString.get(this, "target")
        set(newValue) {attributeStringString.set(this, "target", newValue)}


}


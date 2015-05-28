package html4k

import html4k.*
import html4k.impl.*
import html4k.attributes.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

public open class SAMP(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("samp", consumer, initialAttributes), CommonAttributeGroupFacade, PhrasingContent {

}

public open class SCRIPT(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("script", consumer, initialAttributes) {
    var charset : String
        get()  = attributeStringString.get(this, "charset")
        set(newValue) {attributeStringString.set(this, "charset", newValue)}

    var type : ScriptType
        get()  = attributeScriptTypeEnumScriptTypeValues.get(this, "type")
        set(newValue) {attributeScriptTypeEnumScriptTypeValues.set(this, "type", newValue)}

    var src : String
        get()  = attributeStringString.get(this, "src")
        set(newValue) {attributeStringString.set(this, "src", newValue)}

    var defer : Boolean
        get()  = attributeBooleanTicker.get(this, "defer")
        set(newValue) {attributeBooleanTicker.set(this, "defer", newValue)}

    var async : Boolean
        get()  = attributeBooleanTicker.get(this, "async")
        set(newValue) {attributeBooleanTicker.set(this, "async", newValue)}


}

public open class SECTION(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("section", consumer, initialAttributes), CommonAttributeGroupFacade, FlowContent {

}

public open class SELECT(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("select", consumer, initialAttributes), CommonAttributeGroupFacade {
    var autoFocus : Boolean
        get()  = attributeBooleanTicker.get(this, "autofocus")
        set(newValue) {attributeBooleanTicker.set(this, "autofocus", newValue)}

    var disabled : Boolean
        get()  = attributeBooleanTicker.get(this, "disabled")
        set(newValue) {attributeBooleanTicker.set(this, "disabled", newValue)}

    var form : String
        get()  = attributeStringString.get(this, "form")
        set(newValue) {attributeStringString.set(this, "form", newValue)}

    var multiple : Boolean
        get()  = attributeBooleanTicker.get(this, "multiple")
        set(newValue) {attributeBooleanTicker.set(this, "multiple", newValue)}

    var name : String
        get()  = attributeStringString.get(this, "name")
        set(newValue) {attributeStringString.set(this, "name", newValue)}

    var size : String
        get()  = attributeStringString.get(this, "size")
        set(newValue) {attributeStringString.set(this, "size", newValue)}


}
fun SELECT.option(block : OPTION.() -> Unit) : Unit = buildOPTION(emptyMap, consumer, block)
fun SELECT.option(content : String = "") : Unit = buildOPTION(emptyMap, consumer, {+content})

fun SELECT.optGroup(label : String? = null, block : OPTGROUP.() -> Unit) : Unit = buildOPTGROUP(listOf("label" to label).toAttributesMap(), consumer, block)


public open class SMALL(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("small", consumer, initialAttributes), CommonAttributeGroupFacade, PhrasingContent {

}

public open class SOURCE(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("source", consumer, initialAttributes), CommonAttributeGroupFacade {
    var src : String
        get()  = attributeStringString.get(this, "src")
        set(newValue) {attributeStringString.set(this, "src", newValue)}

    var type : String
        get()  = attributeStringString.get(this, "type")
        set(newValue) {attributeStringString.set(this, "type", newValue)}

    var media : String
        get()  = attributeStringString.get(this, "media")
        set(newValue) {attributeStringString.set(this, "media", newValue)}


}

public open class SPAN(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("span", consumer, initialAttributes), CommonAttributeGroupFacade, PhrasingContent {

}

public open class STRONG(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("strong", consumer, initialAttributes), CommonAttributeGroupFacade, PhrasingContent {

}

public open class STYLE(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("style", consumer, initialAttributes), CommonAttributeGroupFacade {
    var type : String
        get()  = attributeStringString.get(this, "type")
        set(newValue) {attributeStringString.set(this, "type", newValue)}

    var media : String
        get()  = attributeStringString.get(this, "media")
        set(newValue) {attributeStringString.set(this, "media", newValue)}

    var scoped : Boolean
        get()  = attributeBooleanTicker.get(this, "scoped")
        set(newValue) {attributeBooleanTicker.set(this, "scoped", newValue)}


}

public open class SUB(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("sub", consumer, initialAttributes), CommonAttributeGroupFacade, PhrasingContent {

}

public open class SUP(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("sup", consumer, initialAttributes), CommonAttributeGroupFacade, PhrasingContent {

}

public open class SVG(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("svg", consumer, initialAttributes), CommonAttributeGroupFacade {

}


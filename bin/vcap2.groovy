import groovy.json.JsonSlurper;
def vcap = args[0]
def attr = args[1]
def json = new JsonSlurper().parseText(vcap);
println json[attr]
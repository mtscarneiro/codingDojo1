package sbfatendimento.codingdojoatendimento01.service.exceptions

class ResourceNotFoundException(id: Long?): RuntimeException("Errozinho safado por causa do $id") {

}

def call(){
  sh ''' echo " this shared library "
  '''
}
def call(name){
  sh ''' echo " the name is ${name}"
  '''
}

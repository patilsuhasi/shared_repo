def call(){
  sh ''' echo " this shared library "
  '''
}
def call(name){
   echo " the name is ${name}"

}

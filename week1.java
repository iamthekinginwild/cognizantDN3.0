public void sort(){

   int i, j, k, tempKey, tempData ;
   Link current,next;
   int size = length();
   k = size ;
   for ( i = 0 ; i < size - 1 ; i++, k-- ) {
      current = first ;
      next = first.next ;
      for ( j = 1 ; j < k ; j++ ) {            
         if ( current.data > next.data ) {
            tempData = current.data ;
            current.data = next.data;
            next.data = tempData ;

            tempKey = current.key;
            current.key = next.key;
            next.key = tempKey;
         }
         current = current.next;
         next = next.next;                        
      }
   }
}


public LinkedList reverse() { 
   LinkedList reversedlist = new LinkedList();
   Link nextLink = null;     
   reversedlist.insertFirst(first.key, first.data);

   Link currentLink = first;       
   // Until no more data in list, 
   // insert current link before first and move ahead.
   while(currentLink.next != null){
      nextLink = currentLink.next;           
      // Insert at start of new list.
      reversedlist.insertFirst(nextLink.key, nextLink.data); 
      //advance to next node
      currentLink = currentLink.next;            
   }      
   return reversedlist;
}


public void concatenate(LinkedList list){
   if(first == null){
      first = list.first;
   }
   if(list.first == null){
      return;
   }
   Link temp = first;
   while(temp.next !=null) {
      temp = temp.next;
   }
   temp.next = list.first;       
}


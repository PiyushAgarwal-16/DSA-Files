// LRU

#include <stdio.h>

void printFrames(int frames[], int F){
    for(int i=0;i<F;i++) frames[i]==-1? printf(" -"): printf(" %d", frames[i]);
}

int main(){
    int F,n; 
    scanf("%d",&F);
    scanf("%d",&n);
    int ref[n];
    for(int i=0;i<n;i++) scanf("%d",&ref[i]);

    int frames[F], last_used[F];
    for(int i=0;i<F;i++){ frames[i]=-1; last_used[i]=-1; }
    int time=0, faults=0;

    printf("\nLRU Page Replacement:\nRef\tResult\tFrames\n");
    for(int i=0;i<n;i++){
        int p=ref[i], hit=0, pos=-1; time++;
        for(int k=0;k<F;k++){
            if(frames[k]==p){ hit=1; pos=k; break; }
        }
        if(hit){
            last_used[pos]=time;
        }else{
            // find empty slot first
            int place=-1;
            for(int k=0;k<F;k++) if(frames[k]==-1){ place=k; break; }
            if(place==-1){
                // replace least recently used
                int lru_idx=0;
                for(int k=1;k<F;k++) if(last_used[k]<last_used[lru_idx]) lru_idx=k;
                place=lru_idx;
            }
            frames[place]=p;
            last_used[place]=time;
            faults++;
        }
        printf("%d\t%s\t", p, hit?"Hit":"Miss");
        printFrames(frames,F);
        printf("\n");
    }
    printf("Total Page Faults: %d\n", faults);
    return 0;
}


// LFU 
#include <stdio.h>

void printFrames(int frames[], int F){
    for(int i=0;i<F;i++) frames[i]==-1? printf(" -"): printf(" %d", frames[i]);
}

int main(){
    int F,n; 
    scanf("%d",&F);
    scanf("%d",&n);
    int ref[n];
    for(int i=0;i<n;i++) scanf("%d",&ref[i]);

    int frames[F], freq[F], age[F];
    for(int i=0;i<F;i++){ frames[i]=-1; freq[i]=0; age[i]=0; }
    int t=0, faults=0;

    printf("\nLFU Page Replacement (tie -> oldest):\nRef\tResult\tFrames\n");
    for(int i=0;i<n;i++){
        int p=ref[i], hit=0, pos=-1; t++;
        for(int k=0;k<F;k++){
            if(frames[k]==p){ hit=1; pos=k; break; }
        }
        if(hit){
            freq[pos]++; age[pos]=t;
        }else{
            // empty slot?
            int place=-1;
            for(int k=0;k<F;k++) if(frames[k]==-1){ place=k; break; }
            if(place==-1){
                // pick lowest freq; if tie, smallest age (oldest)
                place=0;
                for(int k=1;k<F;k++){
                    if(freq[k]<freq[place] || (freq[k]==freq[place] && age[k]<age[place]))
                        place=k;
                }
            }
            frames[place]=p; freq[place]=1; age[place]=t; faults++;
        }
        printf("%d\t%s\t", p, hit?"Hit":"Miss");
        printFrames(frames,F);
        printf("\n");
    }
    printf("Total Page Faults: %d\n", faults);
    return 0;
}

import { createSlice } from '@reduxjs/toolkit';

const initialPostState = {
  // 임의의 값 넣어놓음
  posts: [ {
    id: 1,
    title: "[교환1] 질주 미공포 교환해요",
    images:['/assets/images/photocard/도영.jpg'],
    ownMembers:[{value: '도영', label: '도영'}],
    targetMembers:[{value: '제노', label: '제노'}],
    content:'받자마자 탑로더에 보관해서 상태 좋습니다.',
    type:'교환'}, {
      id: 11,
      title: "Be There For Me 앨범포카 판매해요",
      images: ['./assets/images/photocard/도영.jpg'],
      ownMembers:[{value: '도영', label: '도영'}],
      content:'받자마자 탑로더에 보관해서 상태 좋습니다.',
      type:'판매'},
      {
        id: 2,
        title: "[교환2] 질주 미공포 교환해요",
        images:['/assets/images/photocard/도영.jpg'],
        ownMembers:[{value: '도영', label: '도영'}],
        targetMembers:[{value: '제노', label: '제노'}],
        content:'받자마자 탑로더에 보관해서 상태 좋습니다.',
        type:'교환'},
      {
        id: 3,
        title: "[교환] 질주 미공포 교환해요",
        images:['/assets/images/photocard/도영.jpg'],
        ownMembers:[{value: '도영', label: '도영'}],
        targetMembers:[{value: '제노', label: '제노'}],
        content:'받자마자 탑로더에 보관해서 상태 좋습니다.',
        type:'교환'},
      {
        id: 4,
        title: "[교환] 질주 미공포 교환해요",
        images:['/assets/images/photocard/도영.jpg'],
        ownMembers:[{value: '도영', label: '도영'}],
        targetMembers:[{value: '제노', label: '제노'}],
        content:'받자마자 탑로더에 보관해서 상태 좋습니다.',
        type:'교환'},
      {
        id: 5,
        title: "[교환] 질주 미공포 교환해요",
        images:['/assets/images/photocard/도영.jpg'],
        ownMembers:[{value: '도영', label: '도영'}],
        targetMembers:[{value: '제노', label: '제노'}],
        content:'받자마자 탑로더에 보관해서 상태 좋습니다.',
        type:'교환'}, 
      {
        id: 6,
        title: "[교환] 질주 미공포 교환해요",
        images:['/assets/images/photocard/도영.jpg'],
        ownMembers:[{value: '도영', label: '도영'}],
        targetMembers:[{value: '제노', label: '제노'}],
        content:'받자마자 탑로더에 보관해서 상태 좋습니다.',
        type:'교환'},
      {
        id: 7,
        title: "[교환] 질주 미공포 교환해요",
        images:['/assets/images/photocard/도영.jpg'],
        ownMembers:[{value: '도영', label: '도영'}],
        targetMembers:[{value: '제노', label: '제노'}],
        content:'받자마자 탑로더에 보관해서 상태 좋습니다.',
        type:'교환'}, ],
};

const postSlice = createSlice({
  name: 'post',
  initialState: initialPostState,
  reducers: {
    addPost: (state, action) => {
      state.posts = [...state.posts, action.payload];
    },
    addCards: (state, action) => {
      state.posts = [...state.posts, ...action.payload];
    },
    // 다른 리듀서 추가...
  },
});

export const { addPost, addCards } = postSlice.actions;
export default postSlice.reducer;
